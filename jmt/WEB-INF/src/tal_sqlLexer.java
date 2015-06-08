// $ANTLR 3.5 /home/bob/prog/lo17/ANTLR/tal_sql.g 2015-06-08 16:02:58

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class tal_sqlLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "/home/bob/prog/lo17/ANTLR/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:8:8: ( 'VOULOIR' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:8:10: 'VOULOIR'
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

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:11:7: ( 'COMPTER' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:11:9: 'COMPTER'
			{
			match("COMPTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:14:9: ( 'ARTICLE' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:14:11: 'ARTICLE'
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

	// $ANTLR start "ET"
	public final void mET() throws RecognitionException {
		try {
			int _type = ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:17:4: ( 'ET' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:17:6: 'ET'
			{
			match("ET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ET"

	// $ANTLR start "OU"
	public final void mOU() throws RecognitionException {
		try {
			int _type = OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:18:4: ( 'OU' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:18:6: 'OU'
			{
			match("OU"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OU"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:20:7: ( '.' | '?' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:
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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:23:5: ( 'CONTIENT' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:23:7: 'CONTIENT'
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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:26:5: ( ( ' ' | '\\t' | '\\r' )* | '\\n' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\n') ) {
				alt2=2;
			}

			else {
				alt2=1;
			}

			switch (alt2) {
				case 1 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:26:7: ( ' ' | '\\t' | '\\r' )*
					{
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:26:7: ( ' ' | '\\t' | '\\r' )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0=='\t'||LA1_0=='\r'||LA1_0==' ') ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:
							{
							if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
							break loop1;
						}
					}

					skip();
					}
					break;
				case 2 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:26:39: '\\n'
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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:29:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:29:7: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:29:54: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
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
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:
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
		// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:8: ( SELECT | COUNT | ARTICLE | ET | OU | POINT | MOT | WS | VAR )
		int alt4=9;
		switch ( input.LA(1) ) {
		case 'V':
			{
			int LA4_1 = input.LA(2);
			if ( (LA4_1=='O') ) {
				alt4=1;
			}
			else if ( (LA4_1=='-'||(LA4_1 >= '0' && LA4_1 <= '9')||(LA4_1 >= 'a' && LA4_1 <= 'z')||(LA4_1 >= '\u00A0' && LA4_1 <= '\u00FF')) ) {
				alt4=9;
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
		case 'C':
			{
			int LA4_2 = input.LA(2);
			if ( (LA4_2=='O') ) {
				int LA4_10 = input.LA(3);
				if ( (LA4_10=='M') ) {
					alt4=2;
				}
				else if ( (LA4_10=='N') ) {
					alt4=7;
				}

				else {
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 4, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA4_2=='-'||(LA4_2 >= '0' && LA4_2 <= '9')||(LA4_2 >= 'a' && LA4_2 <= 'z')||(LA4_2 >= '\u00A0' && LA4_2 <= '\u00FF')) ) {
				alt4=9;
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
		case 'A':
			{
			int LA4_3 = input.LA(2);
			if ( (LA4_3=='R') ) {
				alt4=3;
			}
			else if ( (LA4_3=='-'||(LA4_3 >= '0' && LA4_3 <= '9')||(LA4_3 >= 'a' && LA4_3 <= 'z')||(LA4_3 >= '\u00A0' && LA4_3 <= '\u00FF')) ) {
				alt4=9;
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
				alt4=9;
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
				alt4=5;
			}
			else if ( (LA4_5=='-'||(LA4_5 >= '0' && LA4_5 <= '9')||(LA4_5 >= 'a' && LA4_5 <= 'z')||(LA4_5 >= '\u00A0' && LA4_5 <= '\u00FF')) ) {
				alt4=9;
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
			alt4=6;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
		case 'B':
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
			alt4=9;
			}
			break;
		default:
			alt4=8;
		}
		switch (alt4) {
			case 1 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:17: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 3 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:23: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 4 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:31: ET
				{
				mET(); 

				}
				break;
			case 5 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:34: OU
				{
				mOU(); 

				}
				break;
			case 6 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:37: POINT
				{
				mPOINT(); 

				}
				break;
			case 7 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:43: MOT
				{
				mMOT(); 

				}
				break;
			case 8 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:47: WS
				{
				mWS(); 

				}
				break;
			case 9 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:50: VAR
				{
				mVAR(); 

				}
				break;

		}
	}



}
