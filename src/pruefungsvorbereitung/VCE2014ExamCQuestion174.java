package pruefungsvorbereitung;
import java.util.Scanner;
public class VCE2014ExamCQuestion174 {

	public static void main(String[] args) {
		String csv1 = "6,5,true,3";
		Scanner scanner1 = new Scanner( csv1 );
		scanner1.useDelimiter(",");
		int age1 = scanner1.nextInt();
		System.out.println(age1);

		String csv2 = "Sue,5,true,3";
		Scanner scanner2 = new Scanner( csv2 );
		scanner2.useDelimiter(",");
		int age2 = scanner2.nextInt();

	}
}
