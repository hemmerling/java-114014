package pruefungsvorbereitung;

class Test {
	public void test() {
		int x = 5;
		boolean b1 = true;
		boolean b2 = false;

		if ((x == 4) && !b2 )
			System.out.print("1 ");
		System.out.print("2 ");
		if ((b2 = true) && b1 )
			System.out.print("3 ");
	}
}

public class VCE2014ExamCQuestion030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.test();
	}

}


