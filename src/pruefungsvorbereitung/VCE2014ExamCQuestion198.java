package pruefungsvorbereitung;
import  java.io.Console;
public class VCE2014ExamCQuestion198 {
	public static void main(String[] args) {
		Console c = System.console();
		// String pw = c.readPassword("%s", "pw: ");
		char pw1[] = c.readPassword("%s", "pw: ");
		String pw = String.copyValueOf(pw1);
		System.out.println("got " + pw);
		String name = c.readLine("%s", "name: ");
		// The method println(String) 
		// in the type PrintStream is not applicable for the arguments (String, String)
		// System.out.println(" got ", name);
		System.out.println(" got " + name);
	}
}
