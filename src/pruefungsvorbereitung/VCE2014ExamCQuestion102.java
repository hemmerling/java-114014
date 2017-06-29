package pruefungsvorbereitung;

class Pass2 {
public void pass(String [] args) {
int x = 6;
Pass2 p = new Pass2();
p.doStuff(x);
System.out.print(" main x = " + x);
}

void doStuff(int x) {
System.out.print(" doStuff x = " + x++);
}
}
public class VCE2014ExamCQuestion102 {

	public static void main(String[] args) {
		Pass2 pass2 = new Pass2();
		String[] arglist = {"5"};
		pass2.pass(arglist);
	}

}
