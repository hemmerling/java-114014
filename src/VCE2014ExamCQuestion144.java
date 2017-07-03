import java.util.HashSet;

class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}

	public boolean equals(Object o) {
		if ( ! ( o instanceof Person) ) return false;
		Person p = (Person) o;
		return p.name.equals(this.name);
	}

//	public String toString() {
//		return name;
//	}

}

public class VCE2014ExamCQuestion144 {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add(new Person("Peter"));
		hashSet.add(new Person("Peter"));
		hashSet.add(new Person("Paul"));
		System.out.println(hashSet);
		System.out.println(hashSet.toString());
	}
}
