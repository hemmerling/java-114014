package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Literal {

	boolean isDecimalLiteral(String text) {
		boolean result = false;

		String lit1;
		//lit1 ="^\\+*\\-*[0-9][0-9]\\z";
		//lit1 ="^\\+*\\-*[0-9]*\\z";
		//lit1 ="^\\+*\\-*[0-9]+\\z";
		lit1 ="^[\\+\\-]?[0-9]+\\z";
		
		Pattern p = Pattern.compile(lit1);		
		Matcher m = p.matcher(text);
		result = m.find(); 

		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Literal literal = new Literal();

		System.out.println(literal.isDecimalLiteral("10"));    // - Sollwert: true
		System.out.println(literal.isDecimalLiteral("-10"));   // - Sollwert: true
		System.out.println(literal.isDecimalLiteral("+10"));   // - Sollwert: true
		System.out.println(literal.isDecimalLiteral("abc10")); // - Sollwert: false
		System.out.println(literal.isDecimalLiteral("10abc")); // - Sollwert: false

	}

}
