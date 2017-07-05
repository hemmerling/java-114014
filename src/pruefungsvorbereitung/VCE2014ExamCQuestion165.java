package pruefungsvorbereitung;

class ItemTest {
	private final int id;
	public ItemTest(int id) { this.id = id; }
	public void updateId(int newId) { id = newId; } 

	public static void itemTests() {
		ItemTest fa = new ItemTest(42);
		fa.updateId(69);
		System.out.println(fa.id);
	}
}

public class VCE2014ExamCQuestion165 {

	public static void main(String[] args) {
		ItemTest itemTest = new ItemTest();
		itemTest.itemTest();

	}

}
