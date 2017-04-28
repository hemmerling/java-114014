package api;
import java.util.Random;

public class StringSilben {

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
	
	public static void main(String[] args) {
		StringSilben stringSilben = new StringSilben();
		System.out.println(stringSilben.generiere1(stringSilben.arrayMitSilben, 4));
		System.out.println(stringSilben.generiere1(stringSilben.arrayMitSilben, 4).toString());
		// TODO Auto-generated method stub

	}

}
