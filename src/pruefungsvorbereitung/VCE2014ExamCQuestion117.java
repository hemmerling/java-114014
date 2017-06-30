package pruefungsvorbereitung;

import java.io.*;

class Tree { }

class Forest implements Serializable {
	private Tree tree = new Tree();
	public void forest() {
		Forest f = new Forest();
		try {
			FileOutputStream fs = new FileOutputStream("Forest.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(f); os.close();
		} catch (Exception ex) { ex.printStackTrace(); }
	} }

public class VCE2014ExamCQuestion117 {

	public static void main(String[] args) {
		Forest forest = new Forest();
		forest.forest();

	}

}
