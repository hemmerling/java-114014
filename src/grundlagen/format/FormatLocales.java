package grundlagen.format;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class FormatLocales {

	static void printTable(Locale[] locales) {
		
		String fmt = "| %3s | %30s | %15s | %n";
		
		System.out.printf(fmt, "Nr.", "Land", "Sprache");
		
		for (int i = 0; i < locales.length; i++) {
			Locale loc = locales[i];
			
			System.out.printf(fmt, (i+1), 
					loc.getDisplayCountry(), loc.getDisplayLanguage());
		}
	}

	public static void main(String[] args) {

		Locale[] allLocales = Locale.getAvailableLocales();
		
		//in Java 6 muss cmp final sein, damit die Zeile 31 kompiliert
		final Comparator<Locale> cmp = new Comparator<Locale>() {
			public int compare(Locale loc1, Locale loc2) {
				int erg = loc1.getDisplayCountry().compareTo( loc2.getDisplayCountry() );
				
				if(erg==0) {
					erg = loc1.getDisplayLanguage().compareTo( loc2.getDisplayLanguage() );
				}
				
				return erg;
			}
		};
		
//		Arrays.sort(allLocales, cmp);
//		printTable(allLocales);
		
		Comparator<Locale> cmpReverse = new Comparator<Locale>() {
			public int compare(Locale loc1, Locale loc2) {
				return cmp.compare(loc2, loc1); //cmp ist final in Java 6
			}
		}; 

		Arrays.sort(allLocales, cmpReverse);
		printTable(allLocales);
			
	} //end of main
	
}
