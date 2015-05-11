// $ANTLR 3.5 /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g 2015-05-11 14:22:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "BULLETIN", "CONJ", 
		"MOT", "POINT", "SELECT", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int BULLETIN=5;
	public static final int CONJ=6;
	public static final int MOT=7;
	public static final int POINT=8;
	public static final int SELECT=9;
	public static final int VAR=10;
	public static final int WS=11;

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
	@Override public String getGrammarFileName() { return "/home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:27:1: listerequetes returns [String sql = \"\"] : r= requete ;
	public final String listerequetes() throws  {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:28:25: (r= requete )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:30:3: r= requete
			{
			pushFollow(FOLLOW_requete_in_listerequetes164);
			r=requete();
			state._fsp--;


							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:37:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : ( SELECT )? ( ARTICLE | BULLETIN ) MOT ps= params ;
	public final Arbre requete() throws  {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:38:26: ( ( SELECT )? ( ARTICLE | BULLETIN ) MOT ps= params )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:39:3: ( SELECT )? ( ARTICLE | BULLETIN ) MOT ps= params
			{
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:39:3: ( SELECT )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:39:4: SELECT
					{
					match(input,SELECT,FOLLOW_SELECT_in_requete192); 

									req_arbre.ajouteFils(new Arbre("","select distinct"));
								
					}
					break;

			}

			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:44:3: ( ARTICLE | BULLETIN )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==ARTICLE) ) {
				alt2=1;
			}
			else if ( (LA2_0==BULLETIN) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:44:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete209); 

								req_arbre.ajouteFils(new Arbre("","article"));
								
					}
					break;
				case 2 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:48:6: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete221); 

								req_arbre.ajouteFils(new Arbre("","bulletin"));
								
					}
					break;

			}

			match(input,MOT,FOLLOW_MOT_in_requete231); 

							req_arbre.ajouteFils(new Arbre("","from titreresume"));
							req_arbre.ajouteFils(new Arbre("","where"));
						
			pushFollow(FOLLOW_params_in_requete244);
			ps=params();
			state._fsp--;


							ps_arbre = ps;
							req_arbre.ajouteFils(ps_arbre);
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "params"
	// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:64:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( ( CONJ )? par2= param )* ;
	public final Arbre params() throws  {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:65:40: (par1= param ( ( CONJ )? par2= param )* )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:66:3: par1= param ( ( CONJ )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params276);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:71:3: ( ( CONJ )? par2= param )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CONJ||LA4_0==VAR) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:71:4: ( CONJ )? par2= param
					{
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:71:4: ( CONJ )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==CONJ) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:71:4: CONJ
							{
							match(input,CONJ,FOLLOW_CONJ_in_params287); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params294);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:80:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws  {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:80:51: (a= VAR )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:81:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param322); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete192 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_ARTICLE_in_requete209 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BULLETIN_in_requete221 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_MOT_in_requete231 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_params_in_requete244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params276 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_CONJ_in_params287 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_in_params294 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_VAR_in_param322 = new BitSet(new long[]{0x0000000000000002L});
}
