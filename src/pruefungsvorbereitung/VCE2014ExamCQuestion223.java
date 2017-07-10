package pruefungsvorbereitung;

public class VCE2014ExamCQuestion223 {

	public static void main(String[] args) {
		String str = "null";
		boolean isNull = str.equals(null);
		//		if (str == null) {
		if (isNull) {
			System.out.println("null");		
		} else {
			if(str.length() == 0) {
				System.out.println("zero");
			} else {
				System.out.println("some");
			}
		}
	}

}
