package pruefungsvorbereitung;

import java.util.*;

class Hancock1 {
	// insert code here 
	public void addStrings(List list) {
		list.add("foo");
	}
}

class Hancock2 {
	// insert code here 
	public void addStrings(List<String> list) {
		list.add("foo");
	}
}

class Hancock3 {
	// insert code here 
	public void addStrings(List<? super String> list) {
		list.add("foo");
	}
}

class String2 extends String {	
}

class Object2 extends Object {	
}

class Hancock4 {
	// insert code here 
	public void addStrings(List<? extends String> list) {
		// list.add("foo");
	}
	public void addNumbers(List<? extends Number> list) {
		for (Number number:list) {
			System.out.println(number);
		}
//		list.add(43);
	}
}


public class VCE2014ExamCQuestion211 {
	public static void main(String[] args) {
	}
}
