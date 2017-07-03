package pruefungsvorbereitung;

class Hello {
	String title = "";
	int value;
	public Hello() {
		title += " World";
	}

	public void hello() {
		title += " World";
	}

	public Hello(int value) {
		//this(); // Aufruf von Hello();
		super(); // Aufruf von Hello();
		this.value = value;
		title = "Hello";
		hello();
		//Hello();
	}
}

public class VCE2014ExamCQuestion128 {

	public static void main(String[] args) {
		Hello c = new Hello(5);
		System.out.println(c.title);
	}
}
