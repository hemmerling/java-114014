package pruefungsvorbereitung;

class Breaker {
	static String o = "";
	public void breaker() {
		z:
			o = o + 2;
	zz:
	for(int x = 3; x < 8; x++) {
		if(x==4) break;
		if(x==6) 
		{
			break z;
		}
		if(x==7) 
		{
			break zz;
		}
		o = o + x;
	}
	System.out.println(o);
	}
}

public class VCE2014ExamCQuestion153 {
	public static void main(String[] args) {
	}
}
