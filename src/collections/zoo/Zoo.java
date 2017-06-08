package collections.zoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Zoo {
	Set<Tier> tiere = new HashSet<Tier>();  
	
	public void add(Tier tier) {
		tiere.add(tier);
	}
	
	public Collection get() {
		Collection<Tier> result = tiere;
		return result;
	}

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.add(new Zebra());
		zoo.add(new Affe());
		zoo.add(new Affe());
		System.out.println(zoo.get());
	}
}
