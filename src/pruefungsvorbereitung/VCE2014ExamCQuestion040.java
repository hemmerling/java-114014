package pruefungsvorbereitung;

class Person {
	private String name;
	public Person(String name) { this.name = name; }
	public boolean equals(Person p) {
		return p.name.equals(this.name);
	}
}

public class VCE2014ExamCQuestion040 {

	public static void main(String[] args) {
		Person person1 = new Person("Bob");
		Person person2 = new Person("Bob");
		Person person3 = new Person("Jane");
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
	}
}
