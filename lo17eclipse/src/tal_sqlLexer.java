// $ANTLR 3.5 /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g 2015-05-04 13:36:03

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
	@Override public String getGrammarFileName() { return "/home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:3:8: ( 'vouloir' | 'veut' | 'veux' | 'Quels' )
			int alt1=4;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='v') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='o') ) {
					alt1=1;
				}
				else if ( (LA1_1=='e') ) {
					int LA1_4 = input.LA(3);
					if ( (LA1_4=='u') ) {
						int LA1_5 = input.LA(4);
						if ( (LA1_5=='t') ) {
							alt1=2;
						}
						else if ( (LA1_5=='x') ) {
							alt1=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 5, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0=='Q') ) {
				alt1=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:3:10: 'vouloir'
					{
					match("vouloir"); 

					}
					break;
				case 2 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:3:22: 'veut'
					{
					match("veut"); 

					}
					break;
				case 3 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:3:30: 'veux'
					{
					match("veux"); 

					}
					break;
				case 4 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:3:39: 'Quels'
					{
					match("Quels"); 

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
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:6:9: ( 'article' | 'articles' )
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
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:6:11: 'article'
					{
					match("article"); 

					}
					break;
				case 2 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:6:23: 'articles'
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
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:9:10: ( 'bulletin' | 'bulletins' )
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
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:9:12: 'bulletin'
					{
					match("bulletin"); 

					}
					break;
				case 2 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:9:25: 'bulletins'
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
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:12:6: ( 'et' | 'ou' )
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
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:12:8: 'et'
					{
					match("et"); 

					}
					break;
				case 2 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:12:15: 'ou'
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
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:15:7: ( '.' | '?' )
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:
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
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:18:5: ( 'mot' | 'contenir' | 'parler' | 'parlent' | 'parlant' | 'concernent' )
			int alt5=6;
			switch ( input.LA(1) ) {
			case 'm':
				{
				alt5=1;
				}
				break;
			case 'c':
				{
				int LA5_2 = input.LA(2);
				if ( (LA5_2=='o') ) {
					int LA5_4 = input.LA(3);
					if ( (LA5_4=='n') ) {
						int LA5_6 = input.LA(4);
						if ( (LA5_6=='t') ) {
							alt5=2;
						}
						else if ( (LA5_6=='c') ) {
							alt5=6;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
							new NoViableAltException("", 5, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'p':
				{
				int LA5_3 = input.LA(2);
				if ( (LA5_3=='a') ) {
					int LA5_5 = input.LA(3);
					if ( (LA5_5=='r') ) {
						int LA5_7 = input.LA(4);
						if ( (LA5_7=='l') ) {
							int LA5_10 = input.LA(5);
							if ( (LA5_10=='e') ) {
								int LA5_11 = input.LA(6);
								if ( (LA5_11=='r') ) {
									alt5=3;
								}
								else if ( (LA5_11=='n') ) {
									alt5=4;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 5, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA5_10=='a') ) {
								alt5=5;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 10, input);
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
									new NoViableAltException("", 5, 7, input);
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
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:18:7: 'mot'
					{
					match("mot"); 

					}
					break;
				case 2 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:18:15: 'contenir'
					{
					match("contenir"); 

					}
					break;
				case 3 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:18:28: 'parler'
					{
					match("parler"); 

					}
					break;
				case 4 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:18:39: 'parlent'
					{
					match("parlent"); 

					}
					break;
				case 5 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:18:51: 'parlant'
					{
					match("parlant"); 

					}
					break;
				case 6 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:18:63: 'concernent'
					{
					match("concernent"); 

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
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:5: ( ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'la' | 'le' | 'sont' | '«' | '»' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' ) | '\\n' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\t'||LA7_0=='\r'||LA7_0==' '||LA7_0=='J'||LA7_0=='d'||LA7_0=='j'||LA7_0=='l'||LA7_0=='q'||LA7_0=='s'||LA7_0=='\u00AB'||LA7_0=='\u00BB') ) {
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
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'la' | 'le' | 'sont' | '«' | '»' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' )
					{
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:7: ( ' ' | '\\t' | '\\r' | 'je' | 'Je' | 'de' | 'la' | 'le' | 'sont' | '«' | '»' | 'les' | 'du' | 'qui' | 'l\\'' | 'dont' )
					int alt6=16;
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
							alt6=13;
							}
							break;
						case 'o':
							{
							alt6=16;
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
						switch ( input.LA(2) ) {
						case 'a':
							{
							alt6=7;
							}
							break;
						case 'e':
							{
							int LA6_16 = input.LA(3);
							if ( (LA6_16=='s') ) {
								alt6=12;
							}

							else {
								alt6=8;
							}

							}
							break;
						case '\'':
							{
							alt6=15;
							}
							break;
						default:
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
					case 's':
						{
						alt6=9;
						}
						break;
					case '\u00AB':
						{
						alt6=10;
						}
						break;
					case '\u00BB':
						{
						alt6=11;
						}
						break;
					case 'q':
						{
						alt6=14;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}
					switch (alt6) {
						case 1 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:8: ' '
							{
							match(' '); 
							}
							break;
						case 2 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:13: '\\t'
							{
							match('\t'); 
							}
							break;
						case 3 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:20: '\\r'
							{
							match('\r'); 
							}
							break;
						case 4 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:27: 'je'
							{
							match("je"); 

							}
							break;
						case 5 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:34: 'Je'
							{
							match("Je"); 

							}
							break;
						case 6 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:41: 'de'
							{
							match("de"); 

							}
							break;
						case 7 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:47: 'la'
							{
							match("la"); 

							}
							break;
						case 8 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:54: 'le'
							{
							match("le"); 

							}
							break;
						case 9 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:61: 'sont'
							{
							match("sont"); 

							}
							break;
						case 10 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:70: '«'
							{
							match('\u00AB'); 
							}
							break;
						case 11 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:76: '»'
							{
							match('\u00BB'); 
							}
							break;
						case 12 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:82: 'les'
							{
							match("les"); 

							}
							break;
						case 13 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:90: 'du'
							{
							match("du"); 

							}
							break;
						case 14 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:97: 'qui'
							{
							match("qui"); 

							}
							break;
						case 15 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:105: 'l\\''
							{
							match("l'"); 

							}
							break;
						case 16 :
							// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:113: 'dont'
							{
							match("dont"); 

							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:21:133: '\\n'
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
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:24:5: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+ )
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:24:7: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00a0' .. '\\u00ff' ) ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A0' && input.LA(1) <= '\u00FF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:24:47: ( ( 'a' .. 'z' ) | ( '0' .. '9' ) | '-' | ( '\\u00a0' .. '\\u00ff' ) )+
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
					// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:
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
		// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:8: ( SELECT | ARTICLE | BULLETIN | CONJ | POINT | MOT | WS | VAR )
		int alt9=8;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:25: BULLETIN
				{
				mBULLETIN(); 

				}
				break;
			case 4 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:34: CONJ
				{
				mCONJ(); 

				}
				break;
			case 5 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:39: POINT
				{
				mPOINT(); 

				}
				break;
			case 6 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:45: MOT
				{
				mMOT(); 

				}
				break;
			case 7 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:49: WS
				{
				mWS(); 

				}
				break;
			case 8 :
				// /home/maxime/Documents/Dépôts/lo17/ANTLR/tal_sql.g:1:52: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\21\uffff\2\13\2\uffff\5\24\2\55\3\24\4\13\1\24\2\13\7\24\1\uffff\1\73"+
		"\3\24\1\13\1\24\1\13\1\24\2\102\3\24\1\uffff\3\24\2\13\1\24\1\uffff\1"+
		"\102\13\24\1\73\2\24\1\102\1\132\3\24\2\73\1\132\1\uffff\1\137\1\73\1"+
		"\24\1\137\1\uffff\1\24\1\73";
	static final String DFA9_eofS =
		"\142\uffff";
	static final String DFA9_minS =
		"\1\11\6\55\1\uffff\3\55\1\uffff\3\55\1\47\4\55\1\uffff\2\165\1\145\1\164"+
		"\1\154\2\55\1\164\1\156\1\162\4\55\1\156\2\55\1\156\1\151\1\154\1\164"+
		"\1\154\1\151\1\154\1\uffff\1\55\1\143\1\154\1\164\1\55\1\164\1\55\1\157"+
		"\2\55\1\163\1\143\1\145\1\uffff\2\145\1\141\2\55\1\151\1\uffff\1\55\1"+
		"\154\1\164\1\156\1\162\2\156\1\162\1\145\2\151\1\156\1\55\2\164\2\55\1"+
		"\156\1\162\1\145\3\55\1\uffff\2\55\1\156\1\55\1\uffff\1\164\1\55";
	static final String DFA9_maxS =
		"\7\u00ff\1\uffff\3\u00ff\1\uffff\10\u00ff\1\uffff\2\165\1\145\1\164\1"+
		"\154\2\u00ff\1\164\1\156\1\162\4\u00ff\1\156\2\u00ff\1\156\1\151\1\154"+
		"\1\170\1\154\1\151\1\154\1\uffff\1\u00ff\1\164\1\154\1\164\1\u00ff\1\164"+
		"\1\u00ff\1\157\2\u00ff\1\163\1\143\1\145\1\uffff\3\145\2\u00ff\1\151\1"+
		"\uffff\1\u00ff\1\154\1\164\1\156\2\162\1\156\1\162\1\145\2\151\1\156\1"+
		"\u00ff\2\164\2\u00ff\1\156\1\162\1\145\3\u00ff\1\uffff\2\u00ff\1\156\1"+
		"\u00ff\1\uffff\1\164\1\u00ff";
	static final String DFA9_acceptS =
		"\7\uffff\1\5\3\uffff\1\7\10\uffff\1\10\30\uffff\1\4\15\uffff\1\6\6\uffff"+
		"\1\1\27\uffff\1\2\4\uffff\1\3\2\uffff";
	static final String DFA9_specialS =
		"\142\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\13\2\uffff\1\13\22\uffff\1\13\15\uffff\1\7\20\uffff\1\7\1\uffff\11"+
			"\24\1\15\6\24\1\2\11\24\6\uffff\1\3\1\4\1\11\1\16\1\5\4\24\1\14\1\24"+
			"\1\17\1\10\1\24\1\6\1\12\1\23\1\24\1\20\2\24\1\1\4\24\45\uffff\13\24"+
			"\1\21\17\24\1\22\104\24",
			"\1\24\2\uffff\12\24\47\uffff\4\24\1\26\11\24\1\25\13\24\45\uffff\140"+
			"\24",
			"\1\24\2\uffff\12\24\47\uffff\24\24\1\27\5\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\21\24\1\30\10\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\24\24\1\31\5\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\23\24\1\32\6\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\24\24\1\33\5\24\45\uffff\140\24",
			"",
			"\1\24\2\uffff\12\24\47\uffff\16\24\1\34\13\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\16\24\1\35\13\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\1\36\31\24\45\uffff\140\24",
			"",
			"\1\24\2\uffff\12\24\47\uffff\4\24\1\37\25\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\4\24\1\40\25\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\4\24\1\41\11\24\1\43\5\24\1\42\5\24\45"+
			"\uffff\140\24",
			"\1\13\5\uffff\1\24\2\uffff\12\24\47\uffff\1\44\3\24\1\45\25\24\45\uffff"+
			"\140\24",
			"\1\24\2\uffff\12\24\47\uffff\16\24\1\46\13\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\24\24\1\47\5\24\45\uffff\140\24",
			"",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\61",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\22\24\1\62\7\24\45\uffff\140\24",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66\3\uffff\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\75\20\uffff\1\74",
			"\1\76",
			"\1\77",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\100",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\101",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\103",
			"\1\104",
			"\1\105",
			"",
			"\1\106",
			"\1\107",
			"\1\111\3\uffff\1\110",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\112",
			"",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\120\3\uffff\1\117",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\127",
			"\1\130",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\22\24\1\131\7\24\45\uffff\140\24",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"",
			"\1\24\2\uffff\12\24\47\uffff\22\24\1\136\7\24\45\uffff\140\24",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"\1\140",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24",
			"",
			"\1\141",
			"\1\24\2\uffff\12\24\47\uffff\32\24\45\uffff\140\24"
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
