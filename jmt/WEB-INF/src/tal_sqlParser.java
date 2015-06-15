// $ANTLR 3.5 /home/bob/prog/lo17/ANTLR/tal_sql.g 2015-06-15 08:41:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "COUNT", "ET", "MOT", 
		"OU", "POINT", "SELECT", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int COUNT=5;
	public static final int ET=6;
	public static final int MOT=7;
	public static final int OU=8;
	public static final int POINT=9;
	public static final int SELECT=10;
	public static final int VAR=11;
	public static final int WS=12;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public tal_sqlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return tal_sqlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/bob/prog/lo17/ANTLR/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /home/bob/prog/lo17/ANTLR/tal_sql.g:32:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws Exception {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:33:30: (r= requete POINT )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:34:9: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes182);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes184); 

			                lr_arbre = r;
			                sql = lr_arbre.sortArbre();
			            
			}

		}

		    catch(Exception e){throw(e);}

		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /home/bob/prog/lo17/ANTLR/tal_sql.g:42:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT ( ARTICLE | COUNT ) MOT | SELECT ) ps= params ;
	public final Arbre requete() throws Exception {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:43:29: ( ( SELECT ( ARTICLE | COUNT ) MOT | SELECT ) ps= params )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:44:9: ( SELECT ( ARTICLE | COUNT ) MOT | SELECT ) ps= params
			{
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:44:9: ( SELECT ( ARTICLE | COUNT ) MOT | SELECT )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SELECT) ) {
				int LA2_1 = input.LA(2);
				if ( ((LA2_1 >= ARTICLE && LA2_1 <= COUNT)) ) {
					alt2=1;
				}
				else if ( (LA2_1==VAR) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:45:13: SELECT ( ARTICLE | COUNT ) MOT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete244); 

					                    req_arbre.ajouteFils(new Arbre("","select distinct"));
					                
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:49:13: ( ARTICLE | COUNT )
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==ARTICLE) ) {
						alt1=1;
					}
					else if ( (LA1_0==COUNT) ) {
						alt1=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 1, 0, input);
						throw nvae;
					}

					switch (alt1) {
						case 1 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:49:14: ARTICLE
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete277); 

							                req_arbre.ajouteFils(new Arbre("","*"));
							                
							}
							break;
						case 2 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:53:14: COUNT
							{
							match(input,COUNT,FOLLOW_COUNT_in_requete310); 

							                req_arbre.ajouteFils(new Arbre("","count(*)"));
							                
							}
							break;

					}

					match(input,MOT,FOLLOW_MOT_in_requete356); 

					                    req_arbre.ajouteFils(new Arbre("","from texte"));
					                    req_arbre.ajouteFils(new Arbre("","where"));
					                
					}
					break;
				case 2 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:63:11: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete386); 

					            req_arbre.ajouteFils(new Arbre("","select distinct"));
					            req_arbre.ajouteFils(new Arbre("","article"));
					            req_arbre.ajouteFils(new Arbre("","from texte"));
					            req_arbre.ajouteFils(new Arbre("","where"));
					        
					}
					break;

			}

			pushFollow(FOLLOW_params_in_requete416);
			ps=params();
			state._fsp--;


			                ps_arbre = ps;
			                req_arbre.ajouteFils(ps_arbre);
			            
			}

		}

		    catch(Exception e){throw(e);}

		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "param"
	// /home/bob/prog/lo17/ANTLR/tal_sql.g:78:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws Exception {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:78:51: (a= VAR )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:79:5: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param453); 
			 lepar_arbre.ajouteFils(new Arbre("mot LIKE", "'%"+a.getText()+"%'"));
			}

		}

		    catch(Exception e){throw(e);}

		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"



	// $ANTLR start "params"
	// /home/bob/prog/lo17/ANTLR/tal_sql.g:82:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( ( ET | OU )? par2= param )* ;
	public final Arbre params() throws Exception {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;String last="OR";
		try {
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:83:62: (par1= param ( ( ET | OU )? par2= param )* )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:84:9: par1= param ( ( ET | OU )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params499);
			par1=param();
			state._fsp--;


			                par1_arbre = par1;
			                les_pars_arbre.ajouteFils(par1_arbre);
			            
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:90:9: ( ( ET | OU )? par2= param )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ET||LA4_0==OU||LA4_0==VAR) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:90:10: ( ET | OU )? par2= param
					{
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:90:10: ( ET | OU )?
					int alt3=3;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==ET) ) {
						alt3=1;
					}
					else if ( (LA3_0==OU) ) {
						alt3=2;
					}
					switch (alt3) {
						case 1 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:90:12: ET
							{
							match(input,ET,FOLLOW_ET_in_params528); 

							            last = "OR";
							         
							}
							break;
						case 2 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:93:11: OU
							{
							match(input,OU,FOLLOW_OU_in_params541); 

							             last = "OR";
							         
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params568);
					par2=param();
					state._fsp--;


					                par2_arbre = par2;
					                les_pars_arbre.ajouteFils(new Arbre("", last));
					                les_pars_arbre.ajouteFils(par2_arbre);
					                last = "OR";
					            
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}

		    catch(Exception e){throw(e);}

		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes182 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_POINT_in_listerequetes184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete244 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_ARTICLE_in_requete277 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_COUNT_in_requete310 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_MOT_in_requete356 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_SELECT_in_requete386 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_params_in_requete416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_param453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params499 = new BitSet(new long[]{0x0000000000000942L});
	public static final BitSet FOLLOW_ET_in_params528 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_OU_in_params541 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_param_in_params568 = new BitSet(new long[]{0x0000000000000942L});
}
