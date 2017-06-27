package pruefungsvorbereitung;

import java.util.*;
class GetInLine {
public void getLine() {
PriorityQueue<String> pq = new PriorityQueue<String>();
pq.add("banana");
pq.add("pear");
pq.add("apple");
System.out.println(pq.poll() + " " + pq.peek());
}
}
public class VCE2014ExamCQuestion067 {

	public static void main(String[] args) {
		GetInLine getInLine = new GetInLine();
		getInLine.getLine();
	}

}
