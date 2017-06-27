package pruefungsvorbereitung;
import java.util.*;
class WrappedString {
	private String s;
	public WrappedString(String s) { this.s = s; }
}

public class VCE2014ExamCQuestion064 {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		WrappedString ws1 = new WrappedString("aardvark");
		WrappedString ws2 = new WrappedString("aardvark");
		String s1 = new String("a3ardvark");
		String s2 = new String("aardvark");
		hs.add(ws1); hs.add(ws2); hs.add(s1); hs.add(s2);
		System.out.println(hs.size());} } 

