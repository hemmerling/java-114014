package pruefungsvorbereitung;

class MinMax1<E extends Comparable<E>> {
	E min = null;
	E max = null;
	public MinMax1() {}
	public void put(E value) { /* store min or max */ }
}
class MinMax2<E implements Comparable<E>> {
	E min = null;
	E max = null;
	public MinMax2() {}
	public void put(E value) { /* store min or max */ }
}
class MinMax3<E extends Comparable<E>> {
	<E> E min = null;
	<E> E max = null;
	public MinMax3() {}
	public <E> void put(E value) { /* store min or max */ }
}
class MinMax4<E implements Comparable<E>> {
	<E> E min = null;
	<E> E max = null;
	public MinMax4() {}
	public <E> void put(E value) { /* store min or max */ }

	public class VCE2014ExamCQuestion149 {

	}
