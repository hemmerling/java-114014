package pruefungsvorbereitung;

interface A { void x(); }

class B implements A { public void x() {} public void y() {} }
class C extends B { public void x() {} }

public class VCE2014ExamCQuestion125 {
	public static void main(String[] args) {
		java.util.List<A> list = new java.util.ArrayList<A>();
		list.add(new B());
		list.add(new C());
		for (A a : list) {
			a.x();
			a.y(); // The method y() is undefined for the type A
		}
}