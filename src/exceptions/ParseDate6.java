package exceptions;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ParseDate6 {

	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		return result;
	}

	/*
	 *  Parsen Sie bitte den String zum `java.time.LocalDate` (Java 8) 
	 *  oder `java.util.Date` (Java 6). 
	 *  Bitte die Exception bei ungültigen User-Eingaben sinnvoll behandeln. 
	 *  Erlauben Sie bitte dabei dem User die Eingaben zu wiederholen
	 */
	public void parse(){
		boolean valid = false;
		while (!valid) {
			System.out.println("Bitte Datum eingeben:");
			String dateAsString = getUserInput();
			System.out.println("eingegeben: "+dateAsString);
			DateFormat df = DateFormat.getDateInstance();
			
			try {
				Date d = df.parse(dateAsString);
				System.out.println("geparst: " + d);
				System.out.println("in Deutsch: " + displayDateInGerman(d));
				System.out.println("in Englisch: " + displayDateInEnglish(d));
				// Alternativ
				valid = true;
				break;
				
			} catch (ParseException e) {
				System.out.println("Fehler beim Parsen!");
				System.out.println("Bitte das Muster verwenden: " + df.format(new Date()));
				e.printStackTrace();
			}
		}
	}
	
	/*
	 *  Wenn das Parsen erfolgreich war, 
	 *  geben Sie das Datum in deutsch und englisch aus.
	 */
	public String displayDateInGerman(Date aDate) {
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.LONG, 
				DateFormat.FULL, Locale.GERMAN);
		return df1.format(aDate);
	}

	public String displayDateInEnglish(Date aDate) {
		DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.LONG, 
				DateFormat.FULL, Locale.ENGLISH);
		return df1.format(aDate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParseDate6 parseDate6 = new ParseDate6();
		parseDate6.parse();

	}

}
