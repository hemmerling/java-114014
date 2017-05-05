package klasse.vererbung;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;


public class LottoSpiel extends Lotto {

    public LottoSpiel(int anzahlKugel, int anzahlKugelGesamt){
    	this.anzahlKugel = anzahlKugel; 
        this.anzahlKugelGesamt = anzahlKugelGesamt;
    }

    public int[] ziehen(){
    	return generateListOfNumbers(false);
    }
 
    public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return "Spiel "+super.toString();
    }

    public static void main(String[] args) {
	    int anzahlKugel = 7;
	    int anzahlKugelGesamt = 49;
	    LottoSpiel lottoSpiel = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
	    int [] listOfNumbers = lottoSpiel.ziehen();
	    System.out.println(Arrays.toString(listOfNumbers));
	    System.out.println(Arrays.toString(lottoSpiel.print()));
	    System.out.println(Arrays.toString(lottoSpiel.sort()));
	    System.out.println(Arrays.toString(lottoSpiel.print()));
	    System.out.println(lottoSpiel.printVerbose());
	    System.out.println( lottoSpiel );

	    // TODO Auto-generated method stub

	}

}
