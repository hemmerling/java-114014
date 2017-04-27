package grundlagen.operatoren;

public class Arithmetische {

	public static void main(String[] args) {

		// + - / * %

		/*
		 * Das Ergebnis einer arithmetischen Operation ist MINDESTENS vom Typ 'int'
		 */
		
		int x = 2;
		int y = x + 1;
		
		byte b1 = 2 + 1; // implizites Casting (Ausnahme bei Literalen)
//		byte b2 = x + 1; //Compilerfehler: byte <- int
		
		byte b2 = (byte) (x + 1); 			//explizites Casting
		System.out.println("b2 = " + b2);
		
//		byte b3 = b1 + b2;	//Compilerfehler
		byte b3 = (byte) (b1 + b2);
		
		
		double d1 = 3;
		
//		int var1 = 1 * d1; // int <- double		
		double var1 = 1 * d1;
		int var2 = (int)(1 * d1);
				
		System.out.println("var2 = " + var2);
		
		System.out.println("-----------------------------------------------");
		
//		System.out.println( 55 / 0 ); // ArithmeticException
		System.out.println( "55./0 = " + 55. / 0 ); // Infinity
		
		System.out.println("-----------------------------------------------");
		
		int z = 3 % 2;
		System.out.println("3 % 2 = " + z);
		
		z = 2 % 3;
		System.out.println("2 % 3 = " + z);
		
		z = 2 % 0;	// ArithmeticException
		System.out.println("2 % 0 = " + z); //zu der Zeile wird es nicht kommen
	}

}
