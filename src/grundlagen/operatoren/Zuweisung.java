package operatoren;

public class Zuweisung {

	public static void main(String[] args) {
		
		/*
		 * Regel Nr. 1: Compiler kennt nie den Wert einer Variable!!!
		 */
		

		// Immer daran denken: bei Zuweisung werden die Typen verglichen!
		// Ausnahme: bei einigen Literalen
		
		int x = 3; // int <- int

		//Ausnahme (Literal rechts): implizites Casting
		byte b1 = 3; //byte b1 = (byte)3;

//		byte b2 = x;	//Compilerfehler
		
		//Keine Ausnahme mehr, obwohl rechts ein Literal steht:
//		int x2 = 20L;	//Compilerfehler

//		float f1 = 2.3;	//Compilerfehler
		float f1 = 2.3F;

		double d1 = 2.3;
		float f2 = (float)d1;	//explizites Casting
		
		//-----------------------------------
		
		int var1 = Integer.MAX_VALUE;
		System.out.println("var1: " + var1); //2147483647
		
//		byte var2 = var1;
		byte var2 = (byte)var1;
		System.out.println("var2: " + var2);
		
		System.out.println("var1: " + var1); //2147483647
		
	}

}
