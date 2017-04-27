package api;
import java.lang.StringBuilder;

public class StringEinfach {

	private String aString = "Java ist toll";

	public String reverseString(String aString) {
		String result = new StringBuilder(aString).reverse().toString();
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringEinfach stringEinfach = new StringEinfach();
		System.out.println(stringEinfach.reverseString(stringEinfach.aString));
	}
 
}
