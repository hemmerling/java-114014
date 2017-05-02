package api;

public class AufgabeStringMethoden {

	private String a = "Hello";
	private String b = "World";
	
	public void stringMethoden1() {
		System.out.println(a.concat(b));
		System.out.println(a+b);
	    // Kann man concat durch den Konkatenationsoperator (+) ersetzen?
		// http://stackoverflow.com/questions/693597/is-there-a-difference-between-string-concat-and-the-operator-in-java
		System.out.println(a.charAt(1));
		System.out.println(a.length());
		System.out.println(a.isEmpty());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.endsWith("o"));
		System.out.println(a.startsWith("H"));
		System.out.println(a.startsWith("e", 1));
		System.out.println(a.equals("Hello"));
		System.out.println(a.equals("Hallo"));
	    // Kann man die equals durch den Vergleichsoperator (==) ersetzen? NEIN
		System.out.println(a.equalsIgnoreCase("HELLO"));
		// (String) ??;
		System.out.println(a.indexOf(4));
		System.out.println(a.indexOf('H', 4));
		System.out.println(a.indexOf("ello"));
		System.out.println(a.lastIndexOf('l'));
		System.out.println(a.lastIndexOf('l',1));
		System.out.println(a.lastIndexOf("ll"));
		System.out.println(a.lastIndexOf("ll", 1));
		System.out.println(a.replace('e', 'a'));
		System.out.println(a.substring(1));
		System.out.println(a.substring(1,3));
	}

	public void statischeStringMethoden1() {
		boolean b = true;
		System.out.println(String.valueOf(b));
		char c = 'c';
		System.out.println(String.valueOf(c));
		char[] cc = { '1', '2' };
    	System.out.println(String.valueOf(cc));
		double d = 12.4;
		System.out.println(String.valueOf(d));
		double f = 12.4f;
		System.out.println(String.valueOf(f));
		int i = 12;
		System.out.println(String.valueOf(i));
		long l = 12;
		System.out.println(String.valueOf(l));
		long o = 12;
		System.out.println(String.valueOf(o));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AufgabeStringMethoden stringMethoden = new AufgabeStringMethoden();
		stringMethoden.stringMethoden1();
	}

}
