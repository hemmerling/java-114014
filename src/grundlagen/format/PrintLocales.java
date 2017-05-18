package grundlagen.format;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class PrintLocales {

	public String printTable(Locale[] locales){
		String result = "| Nr. | Land | Sprache |\n";
		String fmt = "| %3d | %30s |  %15s | %n";
		for ( int ii = 0; ii < locales.length; ii++) {
			Locale loc = locales[ii];
			result += String.format(fmt, (ii+1),
					  loc.getDisplayCountry(), loc.getDisplayLanguage() );
		}
		return result;
	}
	
	public static void main(String[] args) {
		PrintLocales printLocales = new PrintLocales();
		Locale[] allLocales =  Locale.getAvailableLocales();
		
		// in Java6 muss cmp1 final sein, damit die cmp2 kompiliert
		final Comparator<Locale> cmp1 = new Comparator<Locale>(){
			public int compare(Locale loc1, Locale loc2 ) {
			    int result = loc1.getDisplayCountry().compareTo( loc2.getDisplayCountry());
				if (result== 0){
				    result = loc1.getDisplayLanguage().compareTo( loc2.getDisplayLanguage());
				}
				return result;
			}
		};

		Comparator<Locale> cmp2 = new Comparator<Locale>(){
			public int compare(Locale loc1, Locale loc2 ) {
			    return cmp1.compare(loc2, loc1); // cmp1 ist final in Java6
			}
		};

		//Arrays.sort(allLocales, cmp1);
		//System.out.println(printLocales.printTable(allLocales));

		Arrays.sort(allLocales, cmp2);
		System.out.println(printLocales.printTable(allLocales));

		// TODO Auto-generated method stub

	}

}
