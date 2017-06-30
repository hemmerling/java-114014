package pruefungsvorbereitung;

public class VCE2014ExamCQuestion113 {

	public String test1(){
		String s = "123456789";
		//s = (s-"123").replace(1,3,"24") - "89";
		// The operator - is undefined for the argument type(s) 
		// java.lang.String, java.lang.String
		return s;
	}

	public String test2(){
		StringBuffer s = new StringBuffer("123456789");
		s.delete(0,3).replace(1,3,"24").delete(4,6);
		return s.toString();
	}

	public String test3(){
		StringBuffer s = new StringBuffer("123456789");
		// The method delete(int, int) is undefined for the type String
		//s.substring(3,6).delete(1,3).insert(1, "24");
		return s.toString();
	}

	public String test4(){
		StringBuilder s = new StringBuilder("123456789");
		// The method delete(int, int) is undefined for the type String
		//s.substring(3,6).delete(1,2).insert(1, "24");
		return s.toString();
	}

	public String test5(){
		StringBuilder s = new StringBuilder("123456789");
		s.delete(0,3).delete(1,3).delete(2,5).insert(1, "24");
		return s.toString();
	}

	public static void main(String[] args) {
 		 VCE2014ExamCQuestion113 test = new VCE2014ExamCQuestion113();
		 System.out.println(test.test1());
		 System.out.println(test.test2());
		 System.out.println(test.test3());
		 System.out.println(test.test4());
		 System.out.println(test.test5());
	}

}
