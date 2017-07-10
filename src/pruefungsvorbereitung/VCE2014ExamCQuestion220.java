package pruefungsvorbereitung;

public class VCE2014ExamCQuestion220 {

	public enum Dogs {collie, harrier, shepherd};

	public static void main(String [] args) {
		Dogs myDog = Dogs.shepherd;
		switch (myDog) {
		case collie:
			System.out.print("collie ");
		//case default:
		default:
			System.out.print("retriever ");
		case harrier:
			System.out.print("harrier ");
		}
	}
}