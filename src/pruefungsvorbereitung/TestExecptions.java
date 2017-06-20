package pruefungsvorbereitung;

public class TestExecptions {

	public void divide(int a, int b) {
		try {
			int c = a/b;
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally");
		}
	}
	public static void main(String[] args) {
		TestExecptions testExceptions = new TestExecptions(); 
		testExceptions.divide(1,2);

	}

}
