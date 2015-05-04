// $ANTLR 3.5 /home/bob/prog/lo17/ANTLR/tal_sql.g 2015-05-04 14:20:04

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
	@Override public String getGrammarFileName() { return "/home/bob/prog/lo17/ANTLR/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:3:8: ( '__VOULOIR__' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:3:10: '__VOULOIR__'
			{
			match("__VOULOIR__"); 

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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:6:9: ( '__ARTICLE__' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:6:11: '__ARTICLE__'
			{
			match("__ARTICLE__"); 

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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:9:10: ( '__BULLETIN__' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:9:12: '__BULLETIN__'
			{
			match("__BULLETIN__"); 

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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:12:6: ( '__ET__' | '__OU__' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='_') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='_') ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2=='E') ) {
						alt1=1;
					}
					else if ( (LA1_2=='O') ) {
						alt1=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:12:8: '__ET__'
					{
					match("__ET__"); 

					}
					break;
				case 2 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:12:19: '__OU__'
					{
					match("__OU__"); 

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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:15:7: ( '.' | '?' )
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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:18:5: ( '__CONTIENT__' )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:18:7: '__CONTIENT__'
			{
			match("__CONTIENT__"); 

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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'la' | 'd\\'' | 'le' | 'sont' | '«' | '»' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' ) | '\\n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' '||LA3_0=='J'||LA3_0=='d'||LA3_0=='j'||LA3_0=='l'||LA3_0=='q'||LA3_0=='s'||LA3_0=='\u00AB'||LA3_0=='\u00BB') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'la' | 'd\\'' | 'le' | 'sont' | '«' | '»' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' )
					{
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'la' | 'd\\'' | 'le' | 'sont' | '«' | '»' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' )
					int alt2=17;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt2=1;
						}
						break;
					case '\t':
						{
						alt2=2;
						}
						break;
					case '\r':
						{
						alt2=3;
						}
						break;
					case 'j':
						{
						alt2=4;
						}
						break;
					case 'J':
						{
						alt2=5;
						}
						break;
					case 'd':
						{
						switch ( input.LA(2) ) {
						case 'e':
							{
							alt2=6;
							}
							break;
						case '\'':
							{
							alt2=8;
							}
							break;
						case 'u':
							{
							alt2=14;
							}
							break;
						case 'o':
							{
							alt2=17;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 2, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 'l':
						{
						switch ( input.LA(2) ) {
						case 'a':
							{
							alt2=7;
							}
							break;
						case 'e':
							{
							int LA2_17 = input.LA(3);
							if ( (LA2_17=='s') ) {
								alt2=13;
							}

							else {
								alt2=9;
							}

							}
							break;
						case '\'':
							{
							alt2=16;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 2, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 's':
						{
						alt2=10;
						}
						break;
					case '\u00AB':
						{
						alt2=11;
						}
						break;
					case '\u00BB':
						{
						alt2=12;
						}
						break;
					case 'q':
						{
						alt2=15;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:34: 'Je'
							{
							match("Je"); 

							}
							break;
						case 6 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:41: 'de'
							{
							match("de"); 

							}
							break;
						case 7 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:47: 'la'
							{
							match("la"); 

							}
							break;
						case 8 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:54: 'd\\''
							{
							match("d'"); 

							}
							break;
						case 9 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:63: 'le'
							{
							match("le"); 

							}
							break;
						case 10 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:70: 'sont'
							{
							match("sont"); 

							}
							break;
						case 11 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:79: '«'
							{
							match('\u00AB'); 
							}
							break;
						case 12 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:85: '»'
							{
							match('\u00BB'); 
							}
							break;
						case 13 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:91: 'les'
							{
							match("les"); 

							}
							break;
						case 14 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:99: 'du'
							{
							match("du"); 

							}
							break;
						case 15 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:106: 'qui'
							{
							match("qui"); 

							}
							break;
						case 16 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:114: 'l\\''
							{
							match("l'"); 

							}
							break;
						case 17 :
							// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:122: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/bob/prog/lo17/ANTLR/tal_sql.g:21:142: '\\n'
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
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:24:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:24:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bob/prog/lo17/ANTLR/tal_sql.g:24:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='-'||(LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'a' && LA4_0 <= 'z')||(LA4_0 >= '\u00A0' && LA4_0 <= '\u00FF')) ) {
					alt4=1;
				}

				switch (alt4) {
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
		// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | WS | VAR )
		int alt5=8;
		switch ( input.LA(1) ) {
		case '_':
			{
			int LA5_1 = input.LA(2);
			if ( (LA5_1=='_') ) {
				switch ( input.LA(3) ) {
				case 'V':
					{
					alt5=1;
					}
					break;
				case 'A':
					{
					alt5=2;
					}
					break;
				case 'B':
					{
					alt5=3;
					}
					break;
				case 'E':
				case 'O':
					{
					alt5=4;
					}
					break;
				case 'C':
					{
					alt5=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
							input.consume();
						}
						NoViableAltException nvae =
							new NoViableAltException("", 5, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 1, input);
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
			alt5=5;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=7;
			}
			break;
		case 'j':
			{
			int LA5_4 = input.LA(2);
			if ( (LA5_4=='e') ) {
				int LA5_14 = input.LA(3);
				if ( (LA5_14=='-'||(LA5_14 >= '0' && LA5_14 <= '9')||(LA5_14 >= 'a' && LA5_14 <= 'z')||(LA5_14 >= '\u00A0' && LA5_14 <= '\u00FF')) ) {
					alt5=8;
				}

				else {
					alt5=7;
				}

			}
			else if ( (LA5_4=='-'||(LA5_4 >= '0' && LA5_4 <= '9')||(LA5_4 >= 'a' && LA5_4 <= 'd')||(LA5_4 >= 'f' && LA5_4 <= 'z')||(LA5_4 >= '\u00A0' && LA5_4 <= '\u00FF')) ) {
				alt5=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 4, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'J':
			{
			int LA5_5 = input.LA(2);
			if ( (LA5_5=='e') ) {
				int LA5_15 = input.LA(3);
				if ( (LA5_15=='-'||(LA5_15 >= '0' && LA5_15 <= '9')||(LA5_15 >= 'a' && LA5_15 <= 'z')||(LA5_15 >= '\u00A0' && LA5_15 <= '\u00FF')) ) {
					alt5=8;
				}

				else {
					alt5=7;
				}

			}
			else if ( (LA5_5=='-'||(LA5_5 >= '0' && LA5_5 <= '9')||(LA5_5 >= 'a' && LA5_5 <= 'd')||(LA5_5 >= 'f' && LA5_5 <= 'z')||(LA5_5 >= '\u00A0' && LA5_5 <= '\u00FF')) ) {
				alt5=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 5, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'd':
			{
			switch ( input.LA(2) ) {
			case 'e':
				{
				int LA5_16 = input.LA(3);
				if ( (LA5_16=='-'||(LA5_16 >= '0' && LA5_16 <= '9')||(LA5_16 >= 'a' && LA5_16 <= 'z')||(LA5_16 >= '\u00A0' && LA5_16 <= '\u00FF')) ) {
					alt5=8;
				}

				else {
					alt5=7;
				}

				}
				break;
			case '\'':
				{
				alt5=7;
				}
				break;
			case 'u':
				{
				int LA5_17 = input.LA(3);
				if ( (LA5_17=='-'||(LA5_17 >= '0' && LA5_17 <= '9')||(LA5_17 >= 'a' && LA5_17 <= 'z')||(LA5_17 >= '\u00A0' && LA5_17 <= '\u00FF')) ) {
					alt5=8;
				}

				else {
					alt5=7;
				}

				}
				break;
			case 'o':
				{
				int LA5_18 = input.LA(3);
				if ( (LA5_18=='n') ) {
					int LA5_28 = input.LA(4);
					if ( (LA5_28=='t') ) {
						int LA5_32 = input.LA(5);
						if ( (LA5_32=='-'||(LA5_32 >= '0' && LA5_32 <= '9')||(LA5_32 >= 'a' && LA5_32 <= 'z')||(LA5_32 >= '\u00A0' && LA5_32 <= '\u00FF')) ) {
							alt5=8;
						}

						else {
							alt5=7;
						}

					}

					else {
						alt5=8;
					}

				}

				else {
					alt5=8;
				}

				}
				break;
			case '-':
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
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
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
				alt5=8;
				}
				break;
			default:
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 6, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
			}
			break;
		case 'l':
			{
			switch ( input.LA(2) ) {
			case 'a':
				{
				int LA5_19 = input.LA(3);
				if ( (LA5_19=='-'||(LA5_19 >= '0' && LA5_19 <= '9')||(LA5_19 >= 'a' && LA5_19 <= 'z')||(LA5_19 >= '\u00A0' && LA5_19 <= '\u00FF')) ) {
					alt5=8;
				}

				else {
					alt5=7;
				}

				}
				break;
			case 'e':
				{
				switch ( input.LA(3) ) {
				case 's':
					{
					int LA5_29 = input.LA(4);
					if ( (LA5_29=='-'||(LA5_29 >= '0' && LA5_29 <= '9')||(LA5_29 >= 'a' && LA5_29 <= 'z')||(LA5_29 >= '\u00A0' && LA5_29 <= '\u00FF')) ) {
						alt5=8;
					}

					else {
						alt5=7;
					}

					}
					break;
				case '-':
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
					alt5=8;
					}
					break;
				default:
					alt5=7;
				}
				}
				break;
			case '\'':
				{
				alt5=7;
				}
				break;
			case '-':
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
			case 'b':
			case 'c':
			case 'd':
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
				alt5=8;
				}
				break;
			default:
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 7, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}
			}
			break;
		case 's':
			{
			int LA5_8 = input.LA(2);
			if ( (LA5_8=='o') ) {
				int LA5_21 = input.LA(3);
				if ( (LA5_21=='n') ) {
					int LA5_30 = input.LA(4);
					if ( (LA5_30=='t') ) {
						int LA5_33 = input.LA(5);
						if ( (LA5_33=='-'||(LA5_33 >= '0' && LA5_33 <= '9')||(LA5_33 >= 'a' && LA5_33 <= 'z')||(LA5_33 >= '\u00A0' && LA5_33 <= '\u00FF')) ) {
							alt5=8;
						}

						else {
							alt5=7;
						}

					}

					else {
						alt5=8;
					}

				}

				else {
					alt5=8;
				}

			}
			else if ( (LA5_8=='-'||(LA5_8 >= '0' && LA5_8 <= '9')||(LA5_8 >= 'a' && LA5_8 <= 'n')||(LA5_8 >= 'p' && LA5_8 <= 'z')||(LA5_8 >= '\u00A0' && LA5_8 <= '\u00FF')) ) {
				alt5=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 8, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case '\u00AB':
			{
			int LA5_9 = input.LA(2);
			if ( (LA5_9=='-'||(LA5_9 >= '0' && LA5_9 <= '9')||(LA5_9 >= 'a' && LA5_9 <= 'z')||(LA5_9 >= '\u00A0' && LA5_9 <= '\u00FF')) ) {
				alt5=8;
			}

			else {
				alt5=7;
			}

			}
			break;
		case '\u00BB':
			{
			int LA5_10 = input.LA(2);
			if ( (LA5_10=='-'||(LA5_10 >= '0' && LA5_10 <= '9')||(LA5_10 >= 'a' && LA5_10 <= 'z')||(LA5_10 >= '\u00A0' && LA5_10 <= '\u00FF')) ) {
				alt5=8;
			}

			else {
				alt5=7;
			}

			}
			break;
		case 'q':
			{
			int LA5_11 = input.LA(2);
			if ( (LA5_11=='u') ) {
				int LA5_22 = input.LA(3);
				if ( (LA5_22=='i') ) {
					int LA5_31 = input.LA(4);
					if ( (LA5_31=='-'||(LA5_31 >= '0' && LA5_31 <= '9')||(LA5_31 >= 'a' && LA5_31 <= 'z')||(LA5_31 >= '\u00A0' && LA5_31 <= '\u00FF')) ) {
						alt5=8;
					}

					else {
						alt5=7;
					}

				}

				else {
					alt5=8;
				}

			}
			else if ( (LA5_11=='-'||(LA5_11 >= '0' && LA5_11 <= '9')||(LA5_11 >= 'a' && LA5_11 <= 't')||(LA5_11 >= 'v' && LA5_11 <= 'z')||(LA5_11 >= '\u00A0' && LA5_11 <= '\u00FF')) ) {
				alt5=8;
			}

			else {
				int nvaeMark = input.mark();
				try {
					input.consume();
					NoViableAltException nvae =
						new NoViableAltException("", 5, 11, input);
					throw nvae;
				} finally {
					input.rewind(nvaeMark);
				}
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'k':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'r':
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
			alt5=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:34: CONJ
				{
				mCONJ(); 

				}
				break;
			case 5 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:39: POINT
				{
				mPOINT(); 

				}
				break;
			case 6 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:45: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:49: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /home/bob/prog/lo17/ANTLR/tal_sql.g:1:52: VAR
				{
				mVAR(); 

				}
				break;

		}
	}



}
