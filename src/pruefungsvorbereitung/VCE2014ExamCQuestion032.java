package pruefungsvorbereitung;

public class VCE2014ExamCQuestion032 {

	public void go() {
		String o = "";
		z:
			for(int x = 0; x < 3; x++) {
				for(int y = 0; y < 2; y++) {
					if(x==1) break;
					if(x==2 && y==1) break z;
					o = o + x + y;
					System.out.println(o);
				}
			}
		System.out.println(o);
	}

	public static void main(String[] args) {
		VCE2014ExamCQuestion032 test = new VCE2014ExamCQuestion032();
		test.go();
	}

}
