package pruefungsvorbereitung;

public class VCE2014ExamDQuestion234 {

	public static void main(String[] args) {
		Long tail = 2000L;
		Long distance = 1999L;
		Long story = 1000L;
		System.out.println(tail > distance);
		System.out.println((story * 2) == tail);
		if((tail > distance) ^ ((story * 2) == tail))
			System.out.print("1");
		System.out.println(distance + 1 != tail);
		System.out.println((story * 2) == distance);
		if((distance + 1 != tail) ^ ((story * 2) == distance))
			System.out.print("2");
	}
}
