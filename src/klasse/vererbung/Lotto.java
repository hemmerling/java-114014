package klasse.vererbung;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public int anzahlKugel;
    public int anzahlKugelGesamt;
    public int[] listOfNumbers;
   	static Random r; 
   	static private int seed = 0;
		
    {
   	    r = new Random(seed); 	
   	}
   	
    public Lotto(){
    }

    public String getLine() {
    	Scanner sc = new Scanner(System.in);
    	String result = sc.nextLine();
    	return result;
    }

    public int[] generateListOfNumbers(boolean manual){
      	 this.listOfNumbers = new int[anzahlKugel];
      	 for ( int ii = 0; ii < anzahlKugel; ii++) {
      		 if (manual) {
         		 listOfNumbers[ii] = Integer.parseInt(getLine());
      		 } else {
          		 listOfNumbers[ii] = this.r.nextInt(anzahlKugelGesamt-1+1);      			 
      		 }
      	 }
      	return listOfNumbers;
       }
    
    public int[] sort(){
    	Arrays.sort(listOfNumbers);
   	return this.listOfNumbers;
   }
    
    public int compare(int[] gezogen, int[]getippt){
    	int result = 0;
    	Arrays.sort(gezogen);
    	Arrays.sort(getippt);
    	for (int ii= 0;ii<gezogen.length;ii++) {
    		if (gezogen[ii] == getippt[ii]) {
    			result +=1;
    		}
    	}
   	return result;
   }
    
    public String compareVerbose(int numberOfHits){
    	int gewinn = 0;
    	switch (numberOfHits) {

    		case 1:
    			gewinn = 1;
    			break;
    		case 2: 
     			gewinn = 10;
    			break;
    		case 3: 
     			gewinn = 100;
    			break;
       	    default:
       	    case 4:
    			gewinn = 1000;
    			break;
    	    case 0: 
     	}
    	String result = numberOfHits + " richtige: "+ gewinn + " EUR";

   	return result;
   }


    public int[] print(){
    	return this.listOfNumbers;
    }
    
    public String printVerbose(){
    	return toString();
    }
    
    public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        return anzahlKugel+" aus "+anzahlKugelGesamt+". "+Arrays.toString(print());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
