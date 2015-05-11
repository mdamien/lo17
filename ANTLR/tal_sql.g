grammar tal_sql;

@rulecatch
{
	catch(Exception e){throw(e);}
}

SELECT : 'VOULOIR'
;

ARTICLE : 'ARTICLE'
;

BULLETIN : 'BULLETIN'
;

CONJ : 'ET' | 'OU'
;

POINT : '.' | '?' // TODO replace as "POINT"
;

MOT : 'CONTIENT'
;
 
WS  : (' ' |'\t' | '\r')* {skip();} | '\n'
;

VAR : ('A'..'Z' | 'a'..'z'|'\u00a0'..'\u00ff')(('a'..'z')|('0'..'9')|'-'|('\u00a0'..'\u00ff'))+
;

listerequetes returns [String sql = ""]
	@init	{Arbre lr_arbre;}: 
		r = requete POINT
//		r = requete
			{
				lr_arbre = $r.req_arbre;
				sql = lr_arbre.sortArbre();
			}
;

requete returns [Arbre req_arbre = new Arbre("")]
	@init {Arbre ps_arbre;} : 
		(SELECT 
			{
				req_arbre.ajouteFils(new Arbre("","select distinct"));
			} 
		)?
		(ARTICLE
			{
			req_arbre.ajouteFils(new Arbre("","article"));
			}
		 | BULLETIN
			{
			req_arbre.ajouteFils(new Arbre("","bulletin"));
			})
		MOT
			{
				req_arbre.ajouteFils(new Arbre("","from titreresume"));
				req_arbre.ajouteFils(new Arbre("","where"));
			}
		ps = params 
			{
				ps_arbre = $ps.les_pars_arbre;
				req_arbre.ajouteFils(ps_arbre);
			}
;

params returns [Arbre les_pars_arbre = new Arbre("")]
	@init	{Arbre par1_arbre, par2_arbre;} : 
		par1 = param 
			{
				par1_arbre = $par1.lepar_arbre;
				les_pars_arbre.ajouteFils(par1_arbre);
			}
		(CONJ? par2 = param
			{
				par2_arbre = $par2.lepar_arbre;
				les_pars_arbre.ajouteFils(new Arbre("", "OR"));
				les_pars_arbre.ajouteFils(par2_arbre);
			}
		)*
;

param returns [Arbre lepar_arbre = new Arbre("")] :
	a = VAR
		{ lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));}
;
