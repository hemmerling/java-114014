package grundlagen.ueberladen;

public class Ueberladen {
	
	//public void test() { System.out.println("no args"); };
	//public void test(byte x) { System.out.println("byte"); };
	public void test(int x) { System.out.println("int"); };
	//public void test(float x) { System.out.println("float"); };
	//public void test(long x) { System.out.println("long"); };
	//public void test(Long x) { System.out.println("Long"); };
	public void test(Integer x) { System.out.println("Integer"); };
	//public void test(Number x) { System.out.println("Number"); };
	//public void test(Object x) { System.out.println("Object"); };
	//public void test(int... x) { System.out.println("int..."); };
	
	public void test1(){
		int var = 2;
		test(var);
		test((byte)var);
	}

	public void test2(){
		Integer var = 2;
		test(var);
	}

	public static void main(String[] args) {
		Ueberladen ueberladen = new Ueberladen();
		ueberladen.test1();
		ueberladen.test2();
		// TODO Auto-generated method stub

	}

}
