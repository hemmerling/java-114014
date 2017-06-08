package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *  Todo 2017-06-08:
 *   - Die Zuordnungen in eine TreeMap kopieren, die TreeMap ausgeben
 *   - Eine weitere Map anlegen, in der einer Person mehrere Autios zugeordnet werden können. Testen
 */

public class PersonenFahrzeuge {

	public String print1(Map<PersonNotForHashMap, Auto> map){
		String result = null;
	
		Set<Map.Entry<PersonNotForHashMap, Auto>> entries = map.entrySet();
		
		for ( Map.Entry<PersonNotForHashMap, Auto> ii: entries ) {
			result = ii.getKey().toString();
		}
		return result;
	}

	public String print2(Map<Person, Auto> map){
		String result = null;
	
		Set<Map.Entry<Person, Auto>> entries = map.entrySet();
		
		for ( Map.Entry<Person, Auto> ii: entries ) {
			result = ii.getKey().toString();
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonenFahrzeuge personenFahrzeuge = new PersonenFahrzeuge();
		PersonNotForHashMap pn1 = new PersonNotForHashMap ("Anton", "Meyer");
		PersonNotForHashMap pn2 = new PersonNotForHashMap ("Bob", "Miller");
		PersonNotForHashMap pn3 = new PersonNotForHashMap ("Adam", "Smith");		

		Person p1 = new Person ("Anton", "Meyer");
		Person p2 = new Person ("Bob", "Miller");
		Person p3 = new Person ("Adam", "Smith");		

		Auto a1 = new Auto ("VWGolf", "2010");
		Auto a2 = new Auto ("VWPolo", "2012");
		Auto a3 = new Auto ("OpelCorsa", "2015");
		Auto a4 = new Auto ("BMW3er", "2016");
		
		Map<PersonNotForHashMap, Auto> map1 = new HashMap<PersonNotForHashMap, Auto>();
		Map<Person, Auto> map2 = new HashMap<Person, Auto>();
		
		map1.put(pn1, a1);
		System.out.println(map1);
		map1.put(new PersonNotForHashMap("Anton", "Meyer"), a4);
		System.out.println(map1);
		System.out.println(personenFahrzeuge.print1(map1));

		System.out.println("-----------");
		
		map2.put(p1, a1);
		map2.put(new Person("Anton", "Meyer"), a4);
		System.out.println(map2);
		System.out.println(personenFahrzeuge.print2(map2));
	}

}
