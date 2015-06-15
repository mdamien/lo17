grammar tal_sql;

@rulecatch
{
    catch(Exception e){throw(e);}
}

SELECT : 'VOULOIR'
;

COUNT : 'COMPTER'
;

ARTICLE : 'ARTICLE'
;

ET : 'ET';
OU : 'OU';

POINT : '.' | '?' // TODO replace as "POINT"
;

MOT : 'CONTIENT'
;
 
WS  : (' ' |'\t' | '\r')* {skip();} | '\n'
;

VAR : ('A'..'Z'|'a'..'z'|'0'..'9'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+
;

listerequetes returns [String sql = ""]
    @init   {Arbre lr_arbre;}: 
        r = requete POINT
//      r = requete
            {
                lr_arbre = $r.req_arbre;
                sql = lr_arbre.sortArbre();
            }
;

requete returns [Arbre req_arbre = new Arbre("")]
    @init {Arbre ps_arbre;} : 
        (
            SELECT
                {
                    req_arbre.ajouteFils(new Arbre("","select distinct"));
                }
            (ARTICLE
                {
                req_arbre.ajouteFils(new Arbre("","*"));
                }
            |COUNT
                {
                req_arbre.ajouteFils(new Arbre("","count(*)"));
                }
            )
            MOT
                {
                    req_arbre.ajouteFils(new Arbre("","from texte"));
                    req_arbre.ajouteFils(new Arbre("","where"));
                }
        | SELECT {
            req_arbre.ajouteFils(new Arbre("","select distinct"));
            req_arbre.ajouteFils(new Arbre("","article"));
            req_arbre.ajouteFils(new Arbre("","from texte"));
            req_arbre.ajouteFils(new Arbre("","where"));
        } 
           )
        ps = params 
            {
                ps_arbre = $ps.les_pars_arbre;
                req_arbre.ajouteFils(ps_arbre);
            }
;


param returns [Arbre lepar_arbre = new Arbre("")] :
    a = VAR
        { lepar_arbre.ajouteFils(new Arbre("mot LIKE", "'\%"+a.getText()+"\%'"));}
;
params returns [Arbre les_pars_arbre = new Arbre("")]
    @init   {Arbre par1_arbre, par2_arbre;String last="OR";} : 
        par1 = param 
            {
                par1_arbre = $par1.lepar_arbre;
                les_pars_arbre.ajouteFils(par1_arbre);
            }

        (( ET{
            last = "OR";
         }
         |OU{
             last = "OR";
         }
        )?
         par2 = param
            {
                par2_arbre = $par2.lepar_arbre;
                les_pars_arbre.ajouteFils(new Arbre("", last));
                les_pars_arbre.ajouteFils(par2_arbre);
                last = "OR";
            }
        )*
;

