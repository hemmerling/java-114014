package pruefungsvorbereitung;

import java.util.*;
class Explorer3 {
	static void explorer3() {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> subs = new TreeSet<Integer>();
		for(int i = 606; i < 613; i++)
			if(i%2 == 0) s.add(i);
		subs = (TreeSet)s.subSet(608, true, 611, true);
		System.out.println(s + " " + subs);
		//s.add(629);
		subs.add(611);
		System.out.println(s + " " + subs);
		subs.add(612);
		//subs.add(629);
		System.out.println(s + " " + subs);
	}
}

public class VCE2014ExamCQuestion214 {

	public static void main(String[] args) {
		Explorer3 explorer3 = new Explorer3();
		explorer3.explorer3();
	}
}
