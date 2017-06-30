package pruefungsvorbereitung;
import java.io.*;
class Talk {
	public void talk() {
		Console c;
		// c = new Console();
		c=System.console();
		String pw;
		System.out.print("password: ");
		pw = c.readLine();
		System.out.println("got " + pw);
	}
}
public class VCE2014ExamCQuestion119 {

	public static void main(String[] args) {
		Talk talk = new Talk();
		talk.talk();

	}

}
