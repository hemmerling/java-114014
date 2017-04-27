package arrays;
import java.util.Arrays;

public class AufgabeArrayVergleich {

	private int NUMBER_OF_TESTS;
	
	public boolean equalsMitArray(int[] arr1, int[] arr2){
		boolean result = Arrays.equals(arr1, arr2);
		return result;
	}

	public boolean equalsMitWhile(int[] arr1, int[] arr2){
		boolean result = true;
		int ii = 0;
		while (result) {
			result = ( arr1[ii] == arr2[ii]);
			ii++;
		}
		return result;
	}
	
	public long profile1(int[] arr1, int[] arr2, int numberOfCalls){
	    long currentTime = System.currentTimeMillis();	
		for ( int ii=0; ii<numberOfCalls; ii++) {
			equalsMitWhile(arr1,arr2);
		}
		long duration = System.currentTimeMillis() - currentTime;
		long average = currentTime/numberOfCalls;
		return average;
	}
	

	public static void main(String[] args) {
		int arraySize = 1000;
		int[] arr1 = new int[arraySize]; 
		int[] arr2 = new int[arraySize];
		arr1[arr1.length-1] = 1;
		arr1[arr1.length-1] = 2;
		AufgabeArrayVergleich arrayVergleich = new AufgabeArrayVergleich();
		arrayVergleich.NUMBER_OF_TESTS = 100;
		System.out.println("Dauer von " + arrayVergleich.NUMBER_OF_TESTS + 
				           "Array-Vergleichen: " + 
				           arrayVergleich.profile1(arr1, arr2, arrayVergleich.NUMBER_OF_TESTS));
		arrayVergleich.NUMBER_OF_TESTS = 1000;
		System.out.println("Dauer von " + arrayVergleich.NUMBER_OF_TESTS + 
		           "Array-Vergleichen: " + 
		           arrayVergleich.profile1(arr1, arr2, arrayVergleich.NUMBER_OF_TESTS));

		arr1[0] = 1;
		arr1[0] = 2;
		arrayVergleich = new AufgabeArrayVergleich();
		arrayVergleich.NUMBER_OF_TESTS = 100;
		System.out.println("Dauer von " + arrayVergleich.NUMBER_OF_TESTS + 
				           "Array-Vergleichen: " + 
				           arrayVergleich.profile1(arr1, arr2, arrayVergleich.NUMBER_OF_TESTS));
		arrayVergleich.NUMBER_OF_TESTS = 1000;
		System.out.println("Dauer von " + arrayVergleich.NUMBER_OF_TESTS + 
		           "Array-Vergleichen: " + 
		           arrayVergleich.profile1(arr1, arr2, arrayVergleich.NUMBER_OF_TESTS));

		// TODO Auto-generated method stub

	}

}
