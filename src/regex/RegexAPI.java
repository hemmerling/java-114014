package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexAPI {

	public String suchen(String text, String regulaererAusdruck) {
		String result = "";
		boolean continueSearching = true;
		try {			
			Pattern p = Pattern.compile(regulaererAusdruck);		
			Matcher m = p.matcher(text);
				while (continueSearching) {
					continueSearching = m.find(); 
					if (continueSearching) {
						result = result + "Treffer von " + m.start() + 
								 " bis " + m.end() + " : " +  m.group() + "\n";					
					}
				}
			} catch ( PatternSyntaxException e ) {
				System.err.println("PatternSyntax Exception!\n");
		}

		return result;
	}

	public String ausgabe(String text, String ausdruck) {
		String result;
		result = "Gesucht wird ein Text '" + text + "' mit dem Regex '" + 
		         ausdruck + "' \n";
		result += suchen(text, ausdruck);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		RegexAPI regexApi = new RegexAPI();
		result = regexApi.ausgabe("abac", "a"); 
		System.out.println(result);

		result = regexApi.ausgabe("a_b_c", "[abc]"); 
		System.out.println(result);

		result = regexApi.ausgabe("a_b_c_ä_ü_ö_ß", "[A-Za-zöÖäÄüÜß]"); 
		System.out.println(result);

		result = regexApi.ausgabe("bla <p> MyHTMLTag</p> bla", "<p>.*</p>"); 
		System.out.println(result);
		result = regexApi.ausgabe("bla <p>MyHTMLTag</p> bla", "<p>.*</p>"); 
		System.out.println(result);
		result = regexApi.ausgabe("bla <p></p> bla", "<p>.*</p>"); 
		System.out.println(result);

	}

}
