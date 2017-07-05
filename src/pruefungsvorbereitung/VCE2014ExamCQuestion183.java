package pruefungsvorbereitung;

class Plant {
	private String name;
	Plant() { this("fern"); } 
	public Plant(String name) { this.name = name; }
	public String getName() { return name; }
}
class Tree extends Plant {
	public void growFruit() { }
	public void dropLeaves() { }
}

public class VCE2014ExamCQuestion183 {

	public static void main(String[] args) {
		Tree tree = new Tree();
	}
}
