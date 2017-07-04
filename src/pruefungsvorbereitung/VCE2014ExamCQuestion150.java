package pruefungsvorbereitung;
import java.util.*;

class Example1 {
	public void example() {
		Set set = new TreeSet();
		set.add(new Integer(2));
		set.add(new Integer(1));
		System.out.println(set);
	}
}

class Example2 {
	public void example() {
		Set set = new HashSet();
		set.add(new Integer(2));
		set.add(new Integer(1));
		System.out.println(set);
	}
}

class Example3 {
	public void example() {
//		Set set = new SortedSet();
//		set.add(new Integer(2));
//		set.add(new Integer(1));
//		System.out.println(set);
	}
}

class Example4 {
	public void example() {
//		List set = new SortedList();
//		set.add(new Integer(2));
//		set.add(new Integer(1));
//		System.out.println(set);
	}
}

class Example5 {
	public void example() {
		Set set = new LinkedHashSet();
		set.add(new Integer(2));
		set.add(new Integer(1));
		System.out.println(set);
	}
}


public class VCE2014ExamCQuestion150 {
	public static void main(String[] args) {
		Example1 example1  = new Example1();
		example1.example(); 
		Example2 example2  = new Example2();
		example2.example(); 
		Example5 example5  = new Example5();
		example5.example(); 
	}

}
