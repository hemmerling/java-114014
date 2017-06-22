package pruefungsvorbereitung;

public class VCE2014ExamCQuestion013 {

	public static void parse(String str) {
		float f;
		f = 0;
		try {
			f = Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			f = 0;
		} finally {
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		parse("invalid");
	}
}
