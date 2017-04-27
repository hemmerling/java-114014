package grundlagen.arrays;
import java.util.Arrays;

public class AufgabeArray2D {

	private int[][] arr;
	
	public int[][] initArray1(int[][] arr, int value){
		for (int[] row: arr) {
		    Arrays.fill(row, value);				
		}
		return arr;
	}

	public int[][] initArray2(int[][] arr, int value){
		for (int[] row: arr) {
			for (int innerRow: row) {
				innerRow = value;
			}
		}
		return arr;
	}

	public int[][] createArray(int x, int y){
		int[][] arr = new int[x][y];
		return arr;
	}

	public int[][] createArray(int x, int y, int value){
		int[][] arr = new int[x][y];
		arr = initArray1(arr, value);
		return arr;
	}
	
	public String printArray(int[][] arr, String space){
		String result = "";
	    for (int[] row: arr)
	    {
 	        for (int innerRow: row)
	    	{
	        	result = result + innerRow + space;
	    	}
 		    result = result.substring(0, result.length()-(space.length()+3));
        	result = result + "\n";
        }
		return result;
	}
	
	public String printArray(int[][] arr){
		String result = printArray(arr, " ");
		return result;
	}

	public int[][] setArrayValue(int[][] arr, int x, int y, int value){
		arr[x][y] = value;
		return arr;
	}

	// ***********************
	
	public char[][] createBorderedArray(int breiteHoehe, char value) {
		int breite = breiteHoehe;
		int hoehe = breiteHoehe;
		boolean fuellen = false;
		char[][] arr = new char[breite][hoehe+1];
		for (int ii = 0; ii<hoehe; ii++) {
			for (int jj = 0; jj<breite; jj++) {
				if (fuellen) {
					arr[ii][jj] = '*';
				} else {
					if ((jj == 0 | jj == (breite-1) ) || 
						( ii == 0 | ii == (hoehe-1) )) {
						arr[ii][jj] = value;
					} else {
						arr[ii][jj] = ' ';
					}										
				}
			}	
		}
		return arr;
	}
	
	public String printBoarderedArray(char[][] arr, String space){
		String result = "";
	    for (char[] row: arr)
	    {
 	        for (char innerRow: row)
	    	{
	        	result = result + innerRow + space;
	    	}
 		    result = result.substring(0, result.length()-(space.length()+2));
        	result = result + "\n";
        }
		return result;
	}

	public static void main(String[] args) {
		AufgabeArray2D array2d = new AufgabeArray2D();
		// TODO Auto-generated method stub
		int[][] arr = array2d.createArray(4, 5);
		
		int value = 2;
		arr = array2d.initArray1(arr, value);
		System.out.println(array2d.printArray(arr));
		
		value = 3;
		arr = array2d.initArray1(arr, value);
		System.out.println(array2d.printArray(arr));
			arr = array2d.setArrayValue(arr, 1, 1, 5);
		System.out.println(array2d.printArray(arr));
		
		value = 4;
		arr = array2d.createArray(4, 5, value);
		System.out.println(array2d.printArray(arr));
	
		System.out.println(array2d.printArray(arr, ", "));
		
		// **************
		char ch = 'X';	
		
		char[][] boarderedArr = array2d.createBorderedArray(5, ch);
		System.out.println(array2d.printBoarderedArray(boarderedArr," "));
			
	}
}
