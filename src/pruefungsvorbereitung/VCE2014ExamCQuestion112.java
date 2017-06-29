package pruefungsvorbereitung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class VCE2014ExamCQuestion112 {

	public static Iterator reverse1(List list) {
		Collections.reverse(list);
		return list.iterator();
	}

	public static List reverse2(List list) {
		Collections.sort(list);   // first sort
		Collections.reverse(list); // before you may reverse the sort
		return list;
	}

//	public static void test1(){
//		List list = new ArrayList();
//		list.add("1"); list.add("2"); list.add("3");
//		// Can only iterate over an array or an instance of java.lang.Iterable
//		for (Object obj: reverse1(list))
//		System.out.print(obj + ", ");		
//	}

	public static void test2a(){
		List list = new ArrayList();
		list.add("1"); list.add("3"); list.add("2"); 
		reverse2(list);
		for (Object obj:list)
			System.out.print(obj.toString() + ", ");		
	}
	public static void test2b(){
		List<String> list = new ArrayList<String>();
		list.add("1"); list.add("3"); list.add("2"); 
		reverse2(list);
		for (String obj:list)
			System.out.print(obj + ", ");		
	}

	public static void main(String[] args) {
		//test1();
		test2a();
		//test2b();
	}
}
