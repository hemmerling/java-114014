package pruefungsvorbereitung;

class Donkey2 {
	public void assert2() {
		boolean assertsOn = true;
		//assertsOn = false;
		//assert (assertsOn) : assertsOn = true;
		assert (assertsOn);
		if(assertsOn) {
			System.out.println("assert is on");
		}
	}
}

public class VCE2014ExamCQuestion037 {

	public static void main(String[] args) {
		Donkey2 donkey2 = new Donkey2();
		donkey2.assert2();
	}

}
