package api;
import java.lang.StringBuilder;

public class AufgabeStringEinfach {

	private String aString = "Java ist toll";
	private String[] aFilenameArray = { "hello.txt", "hello.TXT", "hello.", 
								        "hello.t", "hello.bat" };

	public String reverseString(String aString) {
		String result = new StringBuilder(aString).reverse().toString();
		return result;
	}
	
	public boolean isTextFile(String aString) {
		boolean result = false;
		// regular expression "\\." => "."	
		String[] aStringArray = aString.toLowerCase().split("\\."); 
		result = aStringArray[aStringArray.length-1].equals("txt");
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AufgabeStringEinfach stringEinfach = new AufgabeStringEinfach();
		System.out.println(stringEinfach.reverseString(stringEinfach.aString));
		for (String ii: stringEinfach.aFilenameArray) {
			System.out.println(ii + " ist der Name einer Textdatei? " + 
						       stringEinfach.isTextFile(ii));		
		}
	}
 
}
