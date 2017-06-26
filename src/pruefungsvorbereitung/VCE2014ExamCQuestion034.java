package pruefungsvorbereitung;

public class VCE2014ExamCQuestion034 {

	public static void main(String[] args) {
		try {
			// some code here
			int b = 0;
			int a = 1/b;
		} catch (NullPointerException e1) {
			System.out.print("a");
		} catch (Exception e2) {
			System.out.print("b");
		} finally {
			System.out.print("c");
		}
	}

}
