package pruefungsvorbereitung;
import java.util.*;

class Quest {
	public void quest() {
		String[] colors = {"blue", "red", "green", "yellow", "orange"};
		Arrays.sort(colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violet");
		System.out.println(Arrays.toString(colors));
		System.out.println(s2 + " " + s3);
	}
}

public class VCE2014ExamCQuestion072 {
	public static void main(String[] args) {
		Quest quest = new Quest();
		quest.quest();
	}

}
