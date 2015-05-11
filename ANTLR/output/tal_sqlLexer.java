// $ANTLR 3.5 /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g 2015-05-11 15:05:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public tal_sqlLexer() {} 
	public tal_sqlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public tal_sqlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:8:8: ( 'VOULOIR' )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:8:10: 'VOULOIR'
			{
			match("VOULOIR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:11:9: ( 'ARTICLE' )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:11:11: 'ARTICLE'
			{
			match("ARTICLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:14:10: ( 'BULLETIN' )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:14:12: 'BULLETIN'
			{
			match("BULLETIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BULLETIN"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:17:6: ( 'ET' | 'OU' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='E') ) {
				alt1=1;
			}
			else if ( (LA1_0=='O') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:17:8: 'ET'
					{
					match("ET"); 

					}
					break;
				case 2 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:17:15: 'OU'
					{
					match("OU"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONJ"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:20:7: ( '.' | '?' )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "MOT"
	public final void mMOT() throws RecognitionException {
		try {
			int _type = MOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:23:5: ( 'CONTIENT' )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:23:7: 'CONTIENT'
			{
			match("CONTIENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:26:5: ( ( ' ' | '\\t' | '\\r' ) | '\\n' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\t'||LA2_0=='\r'||LA2_0==' ') ) {
				alt2=1;
			}
			else if ( (LA2_0=='\n') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:26:7: ( ' ' | '\\t' | '\\r' )
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					skip();
					}
					break;
				case 2 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:26:38: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:29:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:29:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:29:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='-'||(LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'a' && LA3_0 <= 'z')||(LA3_0 >= '\u00A0' && LA3_0 <= '\u00FF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:
					{
					if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | WS | VAR )
		int alt4=8;
		switch ( input.LA(1) ) {
		case 'V':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1=='O') ) {
				alt4=1;
			}
			else if ( (LA4_1=='-'||(LA4_1 >= '0' && LA4_1 <= '9')||(LA4_1 >= 'a' && LA4_1 <= 'z')||(LA4_1 >= '\u00A0' && LA4_1 <= '\u00FF')) ) {
				alt4=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 4, 1, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'A':
			{
			int LA4_2 = input.LA(2);
			if ( (LA4_2=='R') ) {
				alt4=2;
			}
			else if ( (LA4_2=='-'||(LA4_2 >= '0' && LA4_2 <= '9')||(LA4_2 >= 'a' && LA4_2 <= 'z')||(LA4_2 >= '\u00A0' && LA4_2 <= '\u00FF')) ) {
				alt4=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 4, 2, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'B':
			{
			int LA4_3 = input.LA(2);
			if ( (LA4_3=='U') ) {
				alt4=3;
			}
			else if ( (LA4_3=='-'||(LA4_3 >= '0' && LA4_3 <= '9')||(LA4_3 >= 'a' && LA4_3 <= 'z')||(LA4_3 >= '\u00A0' && LA4_3 <= '\u00FF')) ) {
				alt4=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 4, 3, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'E':
			{
			int LA4_4 = input.LA(2);
			if ( (LA4_4=='T') ) {
				alt4=4;
			}
			else if ( (LA4_4=='-'||(LA4_4 >= '0' && LA4_4 <= '9')||(LA4_4 >= 'a' && LA4_4 <= 'z')||(LA4_4 >= '\u00A0' && LA4_4 <= '\u00FF')) ) {
				alt4=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 4, 4, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'O':
			{
			int LA4_5 = input.LA(2);
			if ( (LA4_5=='U') ) {
				alt4=4;
			}
			else if ( (LA4_5=='-'||(LA4_5 >= '0' && LA4_5 <= '9')||(LA4_5 >= 'a' && LA4_5 <= 'z')||(LA4_5 >= '\u00A0' && LA4_5 <= '\u00FF')) ) {
				alt4=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 4, 5, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '.':
		case '?':
			{
			alt4=5;
			}
			break;
		case 'C':
			{
			int LA4_7 = input.LA(2);
			if ( (LA4_7=='O') ) {
				alt4=6;
			}
			else if ( (LA4_7=='-'||(LA4_7 >= '0' && LA4_7 <= '9')||(LA4_7 >= 'a' && LA4_7 <= 'z')||(LA4_7 >= '\u00A0' && LA4_7 <= '\u00FF')) ) {
				alt4=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 4, 7, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=7;
			}
			break;
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		case '\u00A0':
		case '\u00A1':
		case '\u00A2':
		case '\u00A3':
		case '\u00A4':
		case '\u00A5':
		case '\u00A6':
		case '\u00A7':
		case '\u00A8':
		case '\u00A9':
		case '\u00AA':
		case '\u00AB':
		case '\u00AC':
		case '\u00AD':
		case '\u00AE':
		case '\u00AF':
		case '\u00B0':
		case '\u00B1':
		case '\u00B2':
		case '\u00B3':
		case '\u00B4':
		case '\u00B5':
		case '\u00B6':
		case '\u00B7':
		case '\u00B8':
		case '\u00B9':
		case '\u00BA':
		case '\u00BB':
		case '\u00BC':
		case '\u00BD':
		case '\u00BE':
		case '\u00BF':
		case '\u00C0':
		case '\u00C1':
		case '\u00C2':
		case '\u00C3':
		case '\u00C4':
		case '\u00C5':
		case '\u00C6':
		case '\u00C7':
		case '\u00C8':
		case '\u00C9':
		case '\u00CA':
		case '\u00CB':
		case '\u00CC':
		case '\u00CD':
		case '\u00CE':
		case '\u00CF':
		case '\u00D0':
		case '\u00D1':
		case '\u00D2':
		case '\u00D3':
		case '\u00D4':
		case '\u00D5':
		case '\u00D6':
		case '\u00D7':
		case '\u00D8':
		case '\u00D9':
		case '\u00DA':
		case '\u00DB':
		case '\u00DC':
		case '\u00DD':
		case '\u00DE':
		case '\u00DF':
		case '\u00E0':
		case '\u00E1':
		case '\u00E2':
		case '\u00E3':
		case '\u00E4':
		case '\u00E5':
		case '\u00E6':
		case '\u00E7':
		case '\u00E8':
		case '\u00E9':
		case '\u00EA':
		case '\u00EB':
		case '\u00EC':
		case '\u00ED':
		case '\u00EE':
		case '\u00EF':
		case '\u00F0':
		case '\u00F1':
		case '\u00F2':
		case '\u00F3':
		case '\u00F4':
		case '\u00F5':
		case '\u00F6':
		case '\u00F7':
		case '\u00F8':
		case '\u00F9':
		case '\u00FA':
		case '\u00FB':
		case '\u00FC':
		case '\u00FD':
		case '\u00FE':
		case '\u00FF':
			{
			alt4=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:34: CONJ
				{
				mCONJ(); 

				}
				break;
			case 5 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:39: POINT
				{
				mPOINT(); 

				}
				break;
			case 6 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:45: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:49: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /home/maxime/Documents/LO17/Projet/Dépôt/ANTLR/tal_sql.g:1:52: VAR
				{
				mVAR(); 

				}
				break;

		}
	}



}
