package pruefungsvorbereitung;

public class VCE2014ExamCQuestion009 {

	public enum MyColor {
		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
		private final int rgb;
		MyColor(int rgb) { this.rgb = rgb; }
		public int getRGB() { return rgb; }
	};
	public static void main(String[] args) {
		// insert code here
		//MyColor skyColor = BLUE;
		MyColor treeColor = MyColor.GREEN;
		//if(RED.getRGB() < BLUE.getRGB()) { }
		//Compilation fails due to other error(s) in the code
		//MyColor purple = new MyColor(0xff00ff);
		//MyColor purple = MyColor.BLUE + MyColor.RED;
	}
}


