package operatoren;

public class Logische {
	
	public static void main(String[] args) {

		// ^ 		XOR
		// & && 	AND
		// | || 	OR

		// ! 		NOT

		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println("b2: " + b2);
		
		
		printAND();
		
		
	} // end of main
	
	static void printAND() {
		System.out.println("******** die AND-Logik ********");
		System.out.println("true & true = " + (true & true)); // true
		System.out.println("true & false = " + (true & false)); // false
		System.out.println("false & true = " + (false & true)); // false
		System.out.println("false & false = " + (false & false)); // false
	}
	

}
