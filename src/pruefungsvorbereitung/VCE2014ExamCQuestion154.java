package pruefungsvorbereitung;

public class VCE2014ExamCQuestion154 {
	void go(int x) {
		assert (x > 0);
		switch(x) {
		case 2: break;
		default: assert false;
		}
	}

	private void go2(int x) { 
		assert (x < 0); 
	} 

	public static void main(String[] args) {
		VCE2014ExamCQuestion154 test =  new VCE2014ExamCQuestion154();
		//test.go(-1);
		test.go(1);		
	}
}
