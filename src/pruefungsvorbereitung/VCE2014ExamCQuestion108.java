package pruefungsvorbereitung;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class VCE2014ExamCQuestion108  implements Comparable<Object> {

	public static Collection get1() {
		Collection sorted = new LinkedList();
		sorted.add("B"); sorted.add("C"); sorted.add("A");
		return sorted;
	}

	public static Collection get2() {
		LinkedList sorted = new LinkedList();
		sorted.add("B"); sorted.add("C"); sorted.add("A");
		Collections.sort(sorted);
		return sorted;
	}

	public static void main(String[] args) {
		for (Object obj: get1()) {
			System.out.print(obj + ", ");
		}
		System.out.println();
		for (Object obj: get2()) {
			System.out.print(obj + ", ");
		}
	}

	@Override
	public int compareTo(Object o) {
		int result = this.compareTo(o);
		return result;
	}
}
