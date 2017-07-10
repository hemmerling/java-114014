package pruefungsvorbereitung;
interface DeclareStuff {
	public static final int EASY = 3;
	void doStuff(int t); }
class TestDeclare implements DeclareStuff {
	public static void main(String [] args) {
		int x = 5;
		new TestDeclare().doStuff(++x);
		new TestDeclare().doStuff2(++x);
	}
	// Cannot reduce the visibility of the inherited method from DeclareStuff
	public void doStuff(int s) {
		s += EASY + ++s;
		System.out.println("s " + s);
	}
	void doStuff2(int s) {
		s += EASY + ++s;
		System.out.println("s " + s);
	}
}
public class VCE2014ExamCQuestion230 {
	public static void main(String[] args) {
	}
}
