package klasse.vererbung;

import java.util.Arrays;

public class LottoTipp extends Lotto {
   
    public LottoTipp(int anzahlKugel, int anzahlKugelGesamt){
    	this.anzahlKugel = anzahlKugel; 
        this.anzahlKugelGesamt = anzahlKugelGesamt;
    }
    
    public int[] abgeben(boolean manuell){
    	return generateListOfNumbers(manuell);
    }

    public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "Tipp "+super.toString();
    }
       
	public static void main(String[] args) {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
		LottoTipp lottoTipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
	    int [] listOfNumbers = lottoTipp.abgeben(false);
	    System.out.println(Arrays.toString(listOfNumbers));
	    System.out.println(Arrays.toString(lottoTipp.print()));
	    System.out.println(Arrays.toString(lottoTipp.sort()));
	    System.out.println(Arrays.toString(lottoTipp.print()));
	    System.out.println(lottoTipp.printVerbose());
	    System.out.println(lottoTipp);

	    // Manual input from console
	    // listOfNumbers = lottoTipp.abgeben(true);
        System.out.println(Arrays.toString(listOfNumbers));
	    
        int numberOfHits = lottoTipp.compare( listOfNumbers,  listOfNumbers);
        System.out.println(lottoTipp.compareVerbose(numberOfHits));

		// TODO Auto-generated method stub

	}

}
