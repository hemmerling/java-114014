package api;

public class StringBuilderEinfach {

    private String s1 = "Hello";
    private String s2 = " ";
    private String s3 = "Welt";

	public String stringBuilder1(String s1, String s2, String s3, int amount) {
		String result = "";
		for (int ii= 0; ii<amount; ii++) {
			result = result + s1 + s2 + s3;
		}
		return result;
	}
	
	public StringBuilder stringBuilder2(String s1, String s2, String s3, int amount) {
		StringBuilder result = new StringBuilder();
		for (int ii= 0; ii<amount; ii++) {
			result.append(s1);
			result.append(s2);
			result.append(s3);
		}
		return result;
	}
	
	public static void main(String[] args) {
		StringBuilderEinfach stringBuilderEinfach = new StringBuilderEinfach();
		int amount = 4;
		System.out.println(stringBuilderEinfach.stringBuilder1(stringBuilderEinfach.s1,
 				   											   stringBuilderEinfach.s2, 
 				   											   stringBuilderEinfach.s3, amount));
		System.out.println(stringBuilderEinfach.stringBuilder2(stringBuilderEinfach.s1,
							 				   				   stringBuilderEinfach.s2, 
											   				   stringBuilderEinfach.s3, amount).toString());
		// TODO Auto-generated method stub

	}

}
