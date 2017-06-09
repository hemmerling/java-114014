package regex;

public class StringTokens {

	public static void main(String[] args) {
		
		String str = "Mo Di Mi";
		
		String regex = " "; //trenner
		
		String[] tokens = str.split(regex);
		for (String subStr : tokens) {
			System.out.println(">" + subStr + "<");
		}

		System.out.println("--------------------------------");
		/*
		 * Exam: Sauber Mo Di und Mi kriegen
		 */
		
		str = "Mo. Di. Mi";
		//regex = "\.\s";		//Achtung! Compilerfehler!
		regex = "\\.\\s";
		
		tokens = str.split(regex);
		for (String subStr : tokens) {
			System.out.println(">" + subStr + "<");
		}
		
		System.out.println("--------------------------------");
		/*
		 * Exam: Sauber Mo Di und Mi kriegen
		 */
		
		str = "Mo. Di. Mi.";
		regex = "\\.\\s";
		
		tokens = str.split(regex);
		for (String subStr : tokens) {
			System.out.println(">" + subStr + "<");
		}

		
		System.out.println("-Hausaufgabe--------------------");
		/*
		 * Exam: Sauber Mo Di und Mi kriegen
		 */
		
		str = "Mo. Di. Mi.";
		
		// Alternativen:
		regex = "\\.\\s*";
		//regex = "\\.\\s?";
		//regex = "\\. ?";
		
		tokens = str.split(regex);
		for (String subStr : tokens) {
			System.out.println(">" + subStr + "<");
		}

	}

}

