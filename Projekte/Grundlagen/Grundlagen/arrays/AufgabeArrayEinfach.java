package arrays;

//import java.lang.Math;
import java.util.Random;

public class AufgabeArrayEinfach {

	Random r = new Random(); 

	public int[] createArray(int from, int to, int size){
		int result[] = new int[size];
		for (int ii = 0; ii< result.length; ii++) {
			result[ii] = this.r.nextInt(to-from+1);
		}
		return result;
	}

	public void printArray(int[] array){
		for (int ii = 0; ii< array.length; ii++) {
			System.out.print(array[ii] + " ");
		}
		System.out.println(" ");
		// Alternativer Syntax für Zugriff auf alle Feld-Elemente
		for (int ii: array ) {
			System.out.print(ii + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AufgabeArrayEinfach arrayEinfach = new AufgabeArrayEinfach();
		int result[] = arrayEinfach.createArray(2, 15, 30);
		arrayEinfach.printArray(result);
	}

}
