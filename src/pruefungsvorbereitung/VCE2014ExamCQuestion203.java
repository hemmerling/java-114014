package pruefungsvorbereitung;

class Animal5 { 
	public String noise() { return "peep"; } 
}

class Dog5 extends Animal5 {
	@Override
	public String noise() { return "bark"; }
}

class Cat5 extends Animal5 {
	@Override
	public String noise() { return "meow"; }
}

//class Cat6 extends Dog5 {
//	@Override
//	public String noise() { return "meow"; }
//}

public class VCE2014ExamCQuestion203 {

	public static void main(String[] args) {
		Animal5 animal5 = new Dog5();

//		Cat6 animalx = new Cat6();
//		Dog5 dog6 = (Cat6)animalx;
//		System.out.println(dog6.noise());
		
		//System.out.println(animal5.noise());
		// pruefungsvorbereitung.Dog cannot be cast to pruefungsvorbereitung.Cat
		Cat5 cat5 = (Cat5)animal5;
		System.out.println(cat5.noise());
	}

}
