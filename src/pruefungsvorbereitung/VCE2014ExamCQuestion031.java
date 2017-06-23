package pruefungsvorbereitung;

interface Foo {}
class Alpha implements Foo {}
class Beta extends Alpha {}
class Delta extends Beta {
}

public class VCE2014ExamCQuestion031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta x = new Beta();
		// insert code here
		Alpha a = x;
		Foo f = (Delta)x; // No proper casting, as Delta just an extended implementation of Alpha
		Foo f2 = (Alpha)x; // Alpha implements Foo
		Beta b = (Beta)(Alpha)x; // x is casted to be Alpha and then Beta again
	}
}
