package kontrollstrukturen;

public class IfAbfrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wochentag = 1;
		
		if ( wochentag == 1 ) {
			System.out.println("Heute ist Montag");
		}
		if ( wochentag == 1 )
			System.out.println("Heute ist Montag");
	
		char a = (char)(65);		
		if (a == 65) {
			System.out.println(a + " == " + (char)65);			
		} else {
			System.out.println(a + " != " + (char)65);					
		}
	}

}
