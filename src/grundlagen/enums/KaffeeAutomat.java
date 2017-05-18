package grundlagen.enums;
import java.util.Scanner;

public class KaffeeAutomat {

	KaffeeSorte  selectedKaffeeSorte;

	public String getLine() {
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		return result;
	}

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
    // Der Benutzer wirft das Geld ein bis die notwendige (oder größere) Summe eingesammelt wurde.
	public double bezahlen(Muenze[] muenzen, double preis){
		double zahlung = 0;
		for (Muenze ii: muenzen) {
			zahlung += ii.getMuenzwert();
			if (zahlung >= preis) {
				break;
			}
		}
		return zahlung;
	}
	
    // Das Getränk wird ausgegeben.

    // Das Rückgeld (falls nötig) wird in den gültigen Münzen ausgegeben.
	Muenze rueckgabe(double rueckgabe) {
		Muenze muenze;
		if (rueckgabe >= 2.0) {
			muenze = new Muenze(MuenzenMedallie.EUR2);		
		} else if (rueckgabe >= 1.0) {
			muenze = new Muenze(MuenzenMedallie.EUR1);		
		} else if (rueckgabe >= 0.5) {
			muenze = new Muenze(MuenzenMedallie.CENT50);		
		} else if (rueckgabe >= 0.2) {
			muenze = new Muenze(MuenzenMedallie.CENT20);		
		} else {
			muenze = new Muenze(MuenzenMedallie.CENT10);
		}
    return muenze;
	}

	public Muenze[] rueckgabe(double zahlung, double preis) {
		double rueckgabe = zahlung - preis;
		int ii = 0;
		Muenze muenze;
		while ( rueckgabe > 0.0 ) {
			muenze = rueckgabe( rueckgabe );
			rueckgabe -=muenze.getMuenzwert();
			ii +=1;
		}

		Muenze[] rueckGeld = new Muenze[ii];
	    rueckgabe = zahlung - preis;
	    
		for (int jj = 0; jj<=ii; jj++ ) {
			muenze = rueckgabe( rueckgabe );
			rueckgabe -=muenze.getMuenzwert();
			rueckGeld[jj] = muenze;
		}

		return rueckGeld;
	}

	public String rueckgeldAnzeigen(double zahlung, double preis){
		Muenze[] muenzen = rueckgabe(zahlung, preis);
		String result = "";
		for ( int ii=0; ii<muenzen.length; ii++) {
			
		}
		return result;
	}

	public static void main(String[] args) {
		KaffeeAutomat kaffeeAutomat = new KaffeeAutomat();
		System.out.println(kaffeeAutomat.preiseAnzeigen());
		KaffeeAngebot kaffeeAngebot = new KaffeeAngebot(kaffeeAutomat.auswaehlenSorte(KaffeeSorte.KAFFEE));
		System.out.println(kaffeeAngebot.toString());
		System.out.println(kaffeeAngebot.getPreis());
		// TODO Auto-generated method stub

	}

}
