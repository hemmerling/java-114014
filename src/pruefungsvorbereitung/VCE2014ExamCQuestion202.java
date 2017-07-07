package pruefungsvorbereitung;

class Target {
	private Integer i = 0;
	//private int i = 0;
	public int addOne(){
		return ++i;
	}
}

public class VCE2014ExamCQuestion202 {

	public static void main(String[] args) {
		System.out.println(new Target().addOne());
	}

}
