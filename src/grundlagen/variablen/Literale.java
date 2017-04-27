package grundlagen.variablen;

public class Literale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 12;
		int i2 = +12;
		int i3 = -12;
		
		int i4 = 0x20;  // hexadezimal => f�hrend 0x
		System.out.println(i4);
		int i5 = 020;  // oktal => f�hrende 0, SELTEN
		System.out.println(i5);
		int i6 = 0b00100001; // seit Java 7, bin�r
		System.out.println(i6);
		int i7 = 1_000_000; // seit Java 7, 1000er Stellen trennen
		System.out.println(i6);
		
		long l1 =  12;
		//long l2 = 12345678901; // zu gro�er Int-Literal
		long l3 = 12345678901L; // Long-Literal mit "l" oder "L"
		long l4 = 12345678901l; // Long-Literal mit "l" oder "L"
		
		// double d1 = 12.0; // float, statt double Literal 
		double d2 = 12.0d; 
		double d3 = (double)12.0;
		System.out.println(d3);
		double d4 = 12.0E03d; // 12*10^3
		System.out.println(d4);
		double d5 = 12.0E-03d; // 12*10^3
		
		//float f1 = 12.3;
		float f2 = 12.3F;
		float f3 = 12.3f;
		
		char c1 = 'a';
		System.out.println(c1);
	
		
	}
}
