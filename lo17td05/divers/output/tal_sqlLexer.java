// $ANTLR 3.5 /home/bob/prog/lo17/lo17td05/divers/tal_sql.g 2015-04-20 14:49:22

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
	@Override public String getGrammarFileName() { return "/home/bob/prog/lo17/lo17td05/divers/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:3:8: ( 'vouloir' | 'veut' | 'veux' )
			int alt1=3;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='v') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='o') ) {
					alt1=1;
				}
				else if ( (LA1_1=='e') ) {
					int LA1_3 = input.LA(3);
					if ( (LA1_3=='u') ) {
						int LA1_4 = input.LA(4);
						if ( (LA1_4=='t') ) {
							alt1=2;
						}
						else if ( (LA1_4=='x') ) {
							alt1=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 3, input);
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
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:3:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:3:22: 'veut'
					{
					match("veut"); 

					}
					break;
				case 3 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:3:30: 'veux'
					{
					match("veux"); 

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
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:6:9: ( 'article' | 'articles' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='a') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='r') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='t') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='i') ) {
							int LA2_4 = input.LA(5);
							if ( (LA2_4=='c') ) {
								int LA2_5 = input.LA(6);
								if ( (LA2_5=='l') ) {
									int LA2_6 = input.LA(7);
									if ( (LA2_6=='e') ) {
										int LA2_7 = input.LA(8);
										if ( (LA2_7=='s') ) {
											alt2=2;
										}

										else {
											alt2=1;
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 2, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 2, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
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
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:6:11: 'article'
					{
					match("article"); 

					}
					break;
				case 2 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:6:23: 'articles'
					{
					match("articles"); 

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
	// $ANTLR end "ARTICLE"

	// $ANTLR start "BULLETIN"
	public final void mBULLETIN() throws RecognitionException {
		try {
			int _type = BULLETIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:9:10: ( 'bulletin' | 'bulletins' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='b') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='u') ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2=='l') ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3=='l') ) {
							int LA3_4 = input.LA(5);
							if ( (LA3_4=='e') ) {
								int LA3_5 = input.LA(6);
								if ( (LA3_5=='t') ) {
									int LA3_6 = input.LA(7);
									if ( (LA3_6=='i') ) {
										int LA3_7 = input.LA(8);
										if ( (LA3_7=='n') ) {
											int LA3_8 = input.LA(9);
											if ( (LA3_8=='s') ) {
												alt3=2;
											}

											else {
												alt3=1;
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 3, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 3, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 3, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
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
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:9:12: 'bulletin'
					{
					match("bulletin"); 

					}
					break;
				case 2 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:9:25: 'bulletins'
					{
					match("bulletins"); 

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
	// $ANTLR end "BULLETIN"

	// $ANTLR start "CONJ"
	public final void mCONJ() throws RecognitionException {
		try {
			int _type = CONJ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:12:6: ( 'et' | 'ou' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='e') ) {
				alt4=1;
			}
			else if ( (LA4_0=='o') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:12:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:12:15: 'ou'
					{
					match("ou"); 

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
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:15:7: ( '.' )
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:15:9: '.'
			{
			match('.'); 
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
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:18:5: ( 'mot' | 'contenir' | 'parler' | 'parlent' | 'parlant' )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt5=1;
				}
				break;
			case 'c':
				{
				alt5=2;
				}
				break;
			case 'p':
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3=='a') ) {
					int LA5_4 = input.LA(3);
					if ( (LA5_4=='r') ) {
						int LA5_5 = input.LA(4);
						if ( (LA5_5=='l') ) {
							int LA5_6 = input.LA(5);
							if ( (LA5_6=='e') ) {
								int LA5_7 = input.LA(6);
								if ( (LA5_7=='r') ) {
									alt5=3;
								}
								else if ( (LA5_7=='n') ) {
									alt5=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 5, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA5_6=='a') ) {
								alt5=5;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 4, input);
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
							new NoViableAltException("", 5, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:18:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:18:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:18:28: 'parler'
					{
					match("parler"); 

					}
					break;
				case 4 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:18:39: 'parlent'
					{
					match("parlent"); 

					}
					break;
				case 5 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:18:51: 'parlant'
					{
					match("parlant"); 

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
	// $ANTLR end "MOT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' ) | '\\n' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\t'||LA7_0=='\r'||LA7_0==' '||LA7_0=='J'||LA7_0=='d'||LA7_0=='j'||LA7_0=='l'||LA7_0=='q') ) {
				alt7=1;
			}
			else if ( (LA7_0=='\n') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' )
					{
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' )
					int alt6=11;
					switch ( input.LA(1) ) {
					case ' ':
						{
						alt6=1;
						}
						break;
					case '\t':
						{
						alt6=2;
						}
						break;
					case '\r':
						{
						alt6=3;
						}
						break;
					case 'j':
						{
						alt6=4;
						}
						break;
					case 'J':
						{
						alt6=5;
						}
						break;
					case 'd':
						{
						switch ( input.LA(2) ) {
						case 'e':
							{
							alt6=6;
							}
							break;
						case 'u':
							{
							alt6=8;
							}
							break;
						case 'o':
							{
							alt6=11;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case 'l':
						{
						int LA6_7 = input.LA(2);
						if ( (LA6_7=='e') ) {
							alt6=7;
						}
						else if ( (LA6_7=='\'') ) {
							alt6=10;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case 'q':
						{
						alt6=9;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:34: 'Je'
							{
							match("Je"); 

							}
							break;
						case 6 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:41: 'de'
							{
							match("de"); 

							}
							break;
						case 7 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:48: 'les'
							{
							match("les"); 

							}
							break;
						case 8 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:56: 'du'
							{
							match("du"); 

							}
							break;
						case 9 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:63: 'qui'
							{
							match("qui"); 

							}
							break;
						case 10 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:71: 'l\\''
							{
							match("l'"); 

							}
							break;
						case 11 :
							// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:79: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:21:99: '\\n'
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
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:24:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:24:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:24:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='-'||(LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'a' && LA8_0 <= 'z')||(LA8_0 >= '\u00A0' && LA8_0 <= '\u00FF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
		// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | WS | VAR )
		int alt9=8;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:34: CONJ
				{
				mCONJ(); 

				}
				break;
			case 5 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:39: POINT
				{
				mPOINT(); 

				}
				break;
			case 6 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:45: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:49: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /home/bob/prog/lo17/lo17td05/divers/tal_sql.g:1:52: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\21\uffff\4\20\2\45\3\20\4\12\7\20\1\uffff\1\61\3\20\2\12\1\20\2\66\2"+
		"\20\1\uffff\2\20\1\12\1\20\1\uffff\11\20\1\61\2\20\1\66\1\112\2\20\2\61"+
		"\1\112\1\uffff\1\116\1\61\1\116\1\uffff";
	static final String DFA9_eofS =
		"\117\uffff";
	static final String DFA9_minS =
		"\1\11\5\55\1\uffff\3\55\1\uffff\3\55\1\47\1\55\1\uffff\2\165\1\164\1\154"+
		"\2\55\1\164\1\156\1\162\4\55\1\156\1\163\1\151\1\154\1\164\1\151\1\154"+
		"\1\uffff\1\55\1\164\1\154\1\164\2\55\1\157\2\55\1\143\1\145\1\uffff\1"+
		"\145\1\141\1\55\1\151\1\uffff\1\154\1\164\3\156\1\162\1\145\2\151\1\55"+
		"\2\164\2\55\1\156\1\162\3\55\1\uffff\3\55\1\uffff";
	static final String DFA9_maxS =
		"\6\u00ff\1\uffff\3\u00ff\1\uffff\5\u00ff\1\uffff\2\165\1\164\1\154\2\u00ff"+
		"\1\164\1\156\1\162\4\u00ff\1\156\1\163\1\151\1\154\1\170\1\151\1\154\1"+
		"\uffff\1\u00ff\1\164\1\154\1\164\2\u00ff\1\157\2\u00ff\1\143\1\145\1\uffff"+
		"\2\145\1\u00ff\1\151\1\uffff\1\154\1\164\1\156\1\162\1\156\1\162\1\145"+
		"\2\151\1\u00ff\2\164\2\u00ff\1\156\1\162\3\u00ff\1\uffff\3\u00ff\1\uffff";
	static final String DFA9_acceptS =
		"\6\uffff\1\5\3\uffff\1\7\5\uffff\1\10\24\uffff\1\4\13\uffff\1\6\4\uffff"+
		"\1\1\23\uffff\1\2\3\uffff\1\3";
	static final String DFA9_specialS =
		"\117\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\12\2\uffff\1\12\22\uffff\1\12\15\uffff\1\6\22\uffff\11\20\1\14\20"+
			"\20\6\uffff\1\2\1\3\1\10\1\15\1\4\4\20\1\13\1\20\1\16\1\7\1\20\1\5\1"+
			"\11\1\17\4\20\1\1\4\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\4\20\1\22\11\20\1\21\13\20\45\uffff\140"+
			"\20",
			"\1\20\2\uffff\12\20\47\uffff\21\20\1\23\10\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\24\20\1\24\5\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\23\20\1\25\6\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\24\20\1\26\5\20\45\uffff\140\20",
			"",
			"\1\20\2\uffff\12\20\47\uffff\16\20\1\27\13\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\16\20\1\30\13\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\1\31\31\20\45\uffff\140\20",
			"",
			"\1\20\2\uffff\12\20\47\uffff\4\20\1\32\25\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\4\20\1\33\25\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\4\20\1\34\11\20\1\36\5\20\1\35\5\20\45"+
			"\uffff\140\20",
			"\1\12\5\uffff\1\20\2\uffff\12\20\47\uffff\4\20\1\37\25\20\45\uffff\140"+
			"\20",
			"\1\20\2\uffff\12\20\47\uffff\24\20\1\40\5\20\45\uffff\140\20",
			"",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55\3\uffff\1\56",
			"\1\57",
			"\1\60",
			"",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\65",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\67",
			"\1\70",
			"",
			"\1\71",
			"\1\73\3\uffff\1\72",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\74",
			"",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\101\3\uffff\1\100",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\107",
			"\1\110",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\22\20\1\111\7\20\45\uffff\140\20",
			"\1\113",
			"\1\114",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"",
			"\1\20\2\uffff\12\20\47\uffff\22\20\1\115\7\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			"\1\20\2\uffff\12\20\47\uffff\32\20\45\uffff\140\20",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | WS | VAR );";
		}
	}

}
