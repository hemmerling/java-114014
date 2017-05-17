package grundlagen.enums;

public class KaffeeAutomat {

	KaffeeSorte  selectedKaffeeSorte;
	
	// Preisliste wird auf dem Bildschirm angezeigt.
	public String preiseAnzeigen(){
		String result;
		KaffeeSorte kaffeeSorte1 = KaffeeSorte.KAFFEE;
		KaffeeSorte kaffeeSorte2 = KaffeeSorte.CAPPUCCINO;
		KaffeeSorte kaffeeSorte3 = KaffeeSorte.ESPRESSO;

		KaffeeAngebot kaffeeAngebot1 = new KaffeeAngebot(kaffeeSorte1); 
		KaffeeAngebot kaffeeAngebot2 = new KaffeeAngebot(kaffeeSorte2); 
		KaffeeAngebot kaffeeAngebot3 = new KaffeeAngebot(kaffeeSorte3); 
		result = kaffeeAngebot1.toString() + "\n" + kaffeeAngebot2.toString()
		                                   + "\n" + kaffeeAngebot3.toString();
		return result;
	}
    // Der Benutzer kann die gewünschte Sorte auswählen
	public KaffeeSorte auswaehlenSorte(KaffeeSorte kaffeeSorte){
		this.selectedKaffeeSorte = kaffeeSorte;
		return kaffeeSorte;
	}
	
    // Danach wird der Benutzer aufgefordert das Geld einzuwerfen. Der Benutzer darf nur gültige Münzen einwerfen (1 Cent, 2 Cent … 2 Euro). Verwenden Sie Enums, um die Münzentypen zu definieren.
	public int bezahlen(Muenze[] muenzen){
		summe = 0;
		return summe;
	}
    // Der Benutzer wirft das Geld ein bis die notwendige (oder größere) Summe eingesammelt wurde.
	
    // Das Getränk wird ausgegeben.
	
    // Das Rückgeld (falls nötig) wird in den gültigen Münzen ausgegeben.

	public static void main(String[] args) {
		KaffeeAutomat kaffeeAutomat = new KaffeeAutomat();
		System.out.println(kaffeeAutomat.preiseAnzeigen());

		// TODO Auto-generated method stub

	}

}
