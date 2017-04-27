package kontrollstrukturen;

public class BreakUndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; ; i++) {
			System.out.println("i = " + i );
			if (i==3) {
				break;
			}
		}
		System.out.println("nach der for");
		
		for (int i = 0; ; i++) {
			if (i%2 ==0) {
				continue;
			}
			System.out.println("i = " + i );
		}
	}

}
