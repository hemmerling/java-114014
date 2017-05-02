package api;
import java.util.Scanner;

public class AufgabeScanner {

	private char[] operators = {'+', '-', '*', '/'};

	public String getLine() {
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		return result;
	}

	public double operation(char operator, double operand1, double operand2) {
		double result = 0;
		switch (operator) {
		case 'P':
		case 'p':
		case '+':
			result = operand1 + operand2;
			break;
		case '-':
			result = operand1 - operand2;
			break;
		case '*':
			result = operand1 * operand2;
			break;
		case '/':
			result = operand1 / operand2;
			break;
		default:
			break;
		}
		return result;
	}
	
	
	public String processOperation2(String[] args) {
		double numericResult = operation(args[1].charAt(0), 
										 Double.parseDouble(args[0]),
							             Double.parseDouble(args[2]) 
							             ); 
		String result = numericResult + "";
		return result;
	}
	
	public String processOperation1(String[] args) {
		String result = "";
		if (args.length == 3) {
			result = processOperation2(inputCommandline(args));	
		} else {
			result = processOperation2(inputIntactive());
		}
		return result;
	}

	public String [] inputIntactive() {
	 String[] result = { getLine(), getLine(), getLine() };
	 return result;
	}

	public String [] inputCommandline(String[] args) {
		 String[] result = { args[0], args[1], args[2] };
		 return result;
		 //return args;
		}

	public static void main(String[] args) {
		AufgabeScanner aufgabeScanner = new AufgabeScanner();
		System.out.println(aufgabeScanner.processOperation1(args));
		// TODO Auto-generated method stub

	}

}
