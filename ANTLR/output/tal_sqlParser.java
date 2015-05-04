// $ANTLR 3.5 /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g 2015-05-04 15:24:59

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
	@Override public String getGrammarFileName() { return "/home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g"; }



	// $ANTLR start "listerequetes"
	// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:27:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws  {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:28:25: (r= requete POINT )
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:29:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes216);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes218); 

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
	// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:36:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE | BULLETIN ) MOT ps= params ;
	public final Arbre requete() throws  {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:37:26: ( SELECT ( ARTICLE | BULLETIN ) MOT ps= params )
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:38:3: SELECT ( ARTICLE | BULLETIN ) MOT ps= params
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete245); 

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:42:3: ( ARTICLE | BULLETIN )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==ARTICLE) ) {
				alt1=1;
			}
			else if ( (LA1_0==BULLETIN) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:42:4: ARTICLE
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete257); 

								req_arbre.ajouteFils(new Arbre("","article"));
								
					}
					break;
				case 2 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:46:6: BULLETIN
					{
					match(input,BULLETIN,FOLLOW_BULLETIN_in_requete269); 

								req_arbre.ajouteFils(new Arbre("","bulletin"));
								
					}
					break;

			}

			match(input,MOT,FOLLOW_MOT_in_requete279); 

							req_arbre.ajouteFils(new Arbre("","from titreresume"));
							req_arbre.ajouteFils(new Arbre("","where"));
						
			pushFollow(FOLLOW_params_in_requete292);
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
	// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:62:1: params returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= param ( ( CONJ )? par2= param )* ;
	public final Arbre params() throws  {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:63:40: (par1= param ( ( CONJ )? par2= param )* )
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:64:3: par1= param ( ( CONJ )? par2= param )*
			{
			pushFollow(FOLLOW_param_in_params324);
			par1=param();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:69:3: ( ( CONJ )? par2= param )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CONJ||LA3_0==VAR) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:69:4: ( CONJ )? par2= param
					{
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:69:4: ( CONJ )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==CONJ) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:69:4: CONJ
							{
							match(input,CONJ,FOLLOW_CONJ_in_params335); 
							}
							break;

					}

					pushFollow(FOLLOW_param_in_params342);
					par2=param();
					state._fsp--;


									par2_arbre = par2;
									les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									les_pars_arbre.ajouteFils(par2_arbre);
								
					}
					break;

				default :
					break loop3;
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
	// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:78:1: param returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre param() throws  {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:78:51: (a= VAR )
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:79:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_param370); 
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



	public static final BitSet FOLLOW_requete_in_listerequetes216 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_POINT_in_listerequetes218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete245 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_ARTICLE_in_requete257 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BULLETIN_in_requete269 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_MOT_in_requete279 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_params_in_requete292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params324 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_CONJ_in_params335 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_param_in_params342 = new BitSet(new long[]{0x0000000000000442L});
	public static final BitSet FOLLOW_VAR_in_param370 = new BitSet(new long[]{0x0000000000000002L});
}
