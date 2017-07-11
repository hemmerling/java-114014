package pruefungsvorbereitung;

public class BatesExam1Question6 {

	public static void main(String[] args) {
	short[][] b = new short [4][4];
	short [][] big = new short [2][2];
	short b3 = 8;
	short b2[][][][] = new short[2][3][2][2];
	
	b2[1][1] = big;
	System.out.println(b2);
	b[1][0] = b3;
	System.out.println(b3);

//	b2[0][1][1] = b; // Type mismatch: cannot convert from short[][] to short[]
//	b2[10][1][1] = b[1][0]; // Type mismatch: cannot convert from short to short[]
	
	b2[1][1][0][1] = b[1][0];
	System.out.println(b2);
	b2[1][1] = b;
	System.out.println(b2);
	}

}
