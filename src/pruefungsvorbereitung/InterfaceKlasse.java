package pruefungsvorbereitung;

public interface InterfaceKlasse {

	public int x1 = 1; // Looks non-static and non-final,
	// but isn't!
	int x2 = 1; // Looks default, non-final,
	// non-static, but isn't!
	static int x3 = 1; // Doesn't show final or public
	final int x4 = 1; // Doesn't show static or public
	public static int x5 = 1; // Doesn't show final
	public final int x6 = 1; // Doesn't show static
	static final int x7 = 1; // Doesn't show public
	public static final int x8 = 1; // what you get implicitly

}
