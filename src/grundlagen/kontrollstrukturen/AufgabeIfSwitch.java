package grundlagen.kontrollstrukturen;

public class AufgabeIfSwitch {

	private static final String rot = "Rot", gelb = "Gelb", gruen = "Gruen", fehler = "Fehler";
	private String zustand[] = {". Bitte warten", ". Gleich geht es los", 
            ". Weg frei", "! Diese Farbe gibt es nicht"};
	
	public String aufgabeIf1(String farbe) {
		String result = farbe;
		if (farbe == rot) {
			result = result + zustand[0];
		} else if (farbe == gelb) {
			result = result + zustand[1];
		} else if (farbe == gruen) {
			result = result + zustand[2];
		} else {
			result = result + zustand[3];
		};
		return ( result );
	}

	public String aufgabeSwitch1(String farbe) {
		String result = ""+farbe;
		switch (farbe) {
			case rot: {
				result = result + zustand[0];
				break;
				}
			case gelb:
				result = result + zustand[1];
				break;
			case gruen:
				result = result + zustand[2];
				break;
			default:
				result = result + zustand[3];
		};
		return ( result );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AufgabeIfSwitch aufgabeIfSwitch = new AufgabeIfSwitch();
		System.out.println("If:");
		System.out.println(aufgabeIfSwitch.aufgabeIf1(rot));
		System.out.println(aufgabeIfSwitch.aufgabeIf1(gelb));
		System.out.println(aufgabeIfSwitch.aufgabeIf1(gruen));
		System.out.println(aufgabeIfSwitch.aufgabeIf1(fehler));
		System.out.println("Switch:");
		System.out.println(aufgabeIfSwitch.aufgabeSwitch1(rot));
		System.out.println(aufgabeIfSwitch.aufgabeSwitch1(gelb));
		System.out.println(aufgabeIfSwitch.aufgabeSwitch1(gruen));
		System.out.println(aufgabeIfSwitch.aufgabeSwitch1(fehler));

	}

}
