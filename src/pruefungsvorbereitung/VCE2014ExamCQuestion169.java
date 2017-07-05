package pruefungsvorbereitung;

interface Fish { }
class Perch implements Fish { }
class Walleye extends Perch { 
	public int x = 1;
}
class Bluegill { }

public class VCE2014ExamCQuestion169 {

	public static void main(String[] args) {
		Fish f = new Walleye();
		//f.x = 2;
		Walleye w2 = new Walleye();
		w2.x = 2;

		Walleye w = new Walleye();
		Bluegill b = new Bluegill();
		if(f instanceof Perch) System.out.print("f-p ");
		if(w instanceof Fish) System.out.print("w-f ");
		if(b instanceof Fish) System.out.print("b-f ");
	}

}
