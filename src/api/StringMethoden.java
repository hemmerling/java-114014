package api;

public class StringMethoden {

	private String a = "Hello";
	private String b = "World";
	
	public void stringMethoden1() {
		System.out.println(a.concat(b));
		System.out.println(a+b);
	    //Kann man concat durch den Konkatenationsoperator (+) ersetzen?
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

	public void statischeMethoden1() {
		boolean b = 0b01;
		System.out.println(valueOf(b));
		char c = 'c';
		System.out.println(valueOf(c));
		char[] cc = { '1', '2' }:
    	System.out.println(valueOf(cc));
		double d = 12.4;
		System.out.println(valueOf(d));
		double f = 12.4f;
		System.out.println(valueOf(f));
		int i = 12;
		System.out.println(valueOf(i));
		long l = 12;
		System.out.println(valueOf(l));
		long o = 12;
		System.out.println(valueOf(o));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethoden stringMethoden = new StringMethoden();
		stringMethoden.stringMethoden1();
	}

}
