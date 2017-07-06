package pruefungsvorbereitung;

public class VCE2014ExamCQuestion199 {

	public static void main(String[] args) {
		String test = "This is a test";
		// Invalid escape sequence (valid ones are \b \t \n \f \r \" \' \\ )
		//String[] tokens = test.split("\s");
		String[] tokens = test.split("\\s");
		System.out.println(tokens.length);
	}

}
