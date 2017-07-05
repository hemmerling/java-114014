package pruefungsvorbereitung;
public class VCE2014ExamCQuestion240 {
	static final int[] a1 = { 100,200 };
	
	static final int[] a2; static { a2=new int[2]; a2[0]=100; a2[1]=200; }
	
//  static final int[] a3 = new int[2]{ 100,200 };

    // static int[] a3 = new int[2]{ 100,200 };

//	static final int[] a4; 
//	static void init() { 
//		a4 = new int[3]; 
//		a4[0]=100; a4[1]=200; 
//	}

	static int[] a4; 
	static void init() { 
		a4 = new int[3]; 
		a4[0]=100; a4[1]=200; 
	}
	
	public static void main(String[] args) {
		VCE2014ExamCQuestion240.init();
		System.out.println(a1);
		System.out.println(a2);
	}
}
