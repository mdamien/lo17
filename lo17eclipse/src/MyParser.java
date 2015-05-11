import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;


public class MyParser extends tal_sqlParser{
	
	public MyParser(TokenStream input) {
		super(input);
	}
	
	@Override
	public void reportError(RecognitionException e) {
		e.printStackTrace();
	}
	

}
