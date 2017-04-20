package kontrollstrukturen;

public class AufgabeFor {

	public String aufgabeFor1() {
		String result = "";
		int inputArray[] = {0, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int ii = 0; ii < inputArray.length-1; ii++) {
			result = result + inputArray[ii] + " ";
		};
		result = result + inputArray[inputArray.length-1];
		// result = "0 2 3 4 5 6 7 8 9";
		return ( result );
	}
	
	public String aufgabeFor2(int start, int stop, int increase) {
		String result = "";
		for (int ii = start; ii < stop; ii = ii + increase) {
			result = result + ii + " ";
		};
		result = result + stop;
		//result = "-4 -2 0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50";
		return ( result );
	}

	public String aufgabeFor3(char start2, char stop2, int increase) {
		String result = "";
		for (int ii = start2; ii < stop2; ii = ii + increase) {
			result = result + (char)ii + " ";
		};
		result = result + stop2;
		//result = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
		return ( result );
	}

	public String aufgabeFor4(char start2, char stop2, int increase) {
		String result = "";
		for (int ii = start2; ii > stop2; ii = ii + increase) {
			result = result + (char)ii + " ";
		};
		result = result + stop2;
		//result = "Z Y X W V U T S R Q P O N M L K J I H G F E D C B A";
		return ( result );
	}
	public static void main(String[] args) {
		AufgabeFor aufgabeFor = new AufgabeFor();
		System.out.println(aufgabeFor.aufgabeFor1());
		int start = -4;
		int stop = 50;
		int increase = 2;
		System.out.println(aufgabeFor.aufgabeFor2(start, stop, increase));
		char start2 = 'a';
		char stop2 = 'z';
		increase = 1;
		System.out.println(aufgabeFor.aufgabeFor3(start2, stop2, increase));
		start2 = 'Z';
		stop2 = 'A';
		increase = -1;
 		System.out.println(aufgabeFor.aufgabeFor4(start2, stop2, increase));

	}

}
