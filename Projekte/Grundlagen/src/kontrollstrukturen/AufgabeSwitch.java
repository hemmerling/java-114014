package kontrollstrukturen;

public class AufgabeSwitch {

	private final static String antwort1 = "Das ist "; 
	private final static String vokal = "ein Vokal";
	private final static String konsonant = "ein Konsonant";
	private final static String fehler = "kein englischer Kleinbuchstabe";

	public String aufgabeSwitch1(char character) {
		String result = antwort1;
		switch (character) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': {
				result = result + vokal;
				break;
			}
			default:
				if ( character >='a' && character <='z' )
				{
					result = result + konsonant;
					
				} else {
					result = result + fehler;			
				}
		};
		return ( result );
	}
	public static void main(String[] args) {
		AufgabeSwitch aufgabeSwitch = new AufgabeSwitch();
		System.out.println(aufgabeSwitch.aufgabeSwitch1('a'));
		System.out.println(aufgabeSwitch.aufgabeSwitch1('b'));
		System.out.println(aufgabeSwitch.aufgabeSwitch1('A'));
		// TODO Auto-generated method stub
	}

}
