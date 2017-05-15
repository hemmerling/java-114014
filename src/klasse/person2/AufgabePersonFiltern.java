package klasse.person2;


public class AufgabePersonFiltern {

	static Person[] filtern(Person[] arr, Filter f) {
		int count = 0;
		// First we count the number of hits
		for (Person person : arr) {
			if( f.accept(person) ) {
				count++;
			}
		}
		
		// Then we create an array ( if we don´t want to use generics ) 
		// of exactly the needed size
		Person[] back = new Person[count];
		
		//  At last, we fill the array by again checking for hits
		int index = 0;
		for (Person person : arr) {
			if(f.accept(person)) {
				back[index++] = person;
			}
		}
		
		return back;
	}
	
	static void print(Person[] arr, String title) {
		System.out.println("*****************************************");
		System.out.println("*****************************************");
		System.out.println(title);
		System.out.println("*****************************************");
		for (Person person : arr) {
			System.out.println(person);
		}
	}
	
	public static void main(String[] args) {

		Person[] arr = {
			new Person("Tom", "Katze", 1940),
			new Person("Jerry", "Maus", 1950),
			new Person("Peter", "Mustermann", 1977),
			new Person("Paul", "Meier", 2001),
		};
		
		Filter f1 = new Filter() {
			public boolean accept(Person p) {
				return p.getGeburtsjahr() > 1960;
			}
		};
		
		Person[] personenNach1960 = filtern(arr, f1);
		print(personenNach1960, "Personen, die nach 1960 geboren waren");
		
		
		Filter f2 = new Filter() {
			@Override
			public boolean accept(Person p) {
				return p.getNachname().indexOf('a') != -1;
			}
		};
		Person[] personenMitA = filtern(arr, f2);
		print(personenMitA, "Personen, die im Nachnamen en 'a' haben");
		
		
		// ab Java 8 (Lambdas, nicht in der Prüfung)
		Filter f3 = (Person p) -> { return p.getGeburtsjahr() > 1960; };
		Filter f4 = p -> p.getGeburtsjahr() > 1960;
		filtern(arr, p -> p.getGeburtsjahr() > 1960);
		
		// ab Java 8 (Methodenreferenzen, nicht in der Prüfung)
		Filter f5 = AufgabePersonFiltern::test;
		filtern(arr, AufgabePersonFiltern::test);
	}
	
	private static boolean test(Person p) {
		return p.getGeburtsjahr() == 3000;
	}

	}
