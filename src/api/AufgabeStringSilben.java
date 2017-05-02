package api;
import java.util.Random;

public class AufgabeStringSilben {

	private Random rand = new Random();
	private String[] arrayMitSilben = { "pro", "gi", "idre", "hier", "die", 
			                            "ist", "un", "mit", "ein", "gen", 
			                            "but", "neu", "von", "kon" };
	
	public String generiere1(String[] aArrayMitSilben, int amount) {
		String result = "";
		int max = arrayMitSilben.length-1;
		for (int ii= 0; ii<amount; ii++) {
			result = result + aArrayMitSilben[rand.nextInt(max + 1)];
		}
		return result;
	}
	
	public StringBuilder generiere2(String[] aArrayMitSilben, int amount) {
		StringBuilder result = new StringBuilder();
		int max = arrayMitSilben.length-1;
		for (int ii= 0; ii<amount; ii++) {
			result.append(aArrayMitSilben[rand.nextInt(max + 1)]);
		}
		return result;
	}
	
	public long profile1(int amount) {
		AufgabeStringSilben stringSilben = new AufgabeStringSilben();
		long currentTime = System.currentTimeMillis();	
		stringSilben.generiere1(stringSilben.arrayMitSilben, amount);
		long duration = System.currentTimeMillis() - currentTime;
		return duration;
	}

	public long profile2(int amount) {
		AufgabeStringSilben stringSilben = new AufgabeStringSilben();
		long currentTime = System.currentTimeMillis();	
		stringSilben.generiere1(stringSilben.arrayMitSilben, amount).toString();
		long duration = System.currentTimeMillis() - currentTime;
		return duration;
	}
	
	public static void main(String[] args) {
		int amount = 1000;
		AufgabeStringSilben stringSilben = new AufgabeStringSilben();
		System.out.println(stringSilben.generiere1(stringSilben.arrayMitSilben, amount) + 
				           " , #Zeitdauer: " + stringSilben.profile1(amount));
		System.out.println(stringSilben.generiere1(stringSilben.arrayMitSilben, amount).toString() + 
				           " , #Zeitdauer: " + stringSilben.profile2(amount));
		// TODO Auto-generated method stub

	}

}
