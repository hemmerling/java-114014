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
	public void addStrings(List<? extends Object> list) {
		Object2 obj2 = new Object2();
//		list.add("foo");
		list = null;
		list.add(obj2);
	}
}


public class VCE2014ExamCQuestion211 {
	public static void main(String[] args) {
	}
}
