package exceptions;

import java.util.Scanner;
// Java 8
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
// Java 6
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ParseDate8 {

	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		return result;
	}

	/*
	 * Parsen Sie bitte den String zum `java.time.LocalDate` (Java 8) 
	 * oder `java.util.Date` (Java 6). 
	 * Bitte die Exception bei ungültigen User-Eingaben sinnvoll behandeln. 
	 * Erlauben Sie bitte dabei dem User die Eingaben zu wiederholen.
	 * 
	 * Jul 20 2013  07:30 PM
	 * Jul 21 2013  10:20 PM
	 * 
	 */
	public String[] parse(String input) {
		 boolean isValid = false;
		 try {
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
			    LocalDate date = LocalDate.parse(input, formatter);
			    System.out.printf("%s%n", date);
			    isValid = true;
			}
			catch (DateTimeParseException exc) {
			    System.out.printf("%s is not parsable!%n", input);
			    //throw exc;      // Rethrow the exception.
			}
			// 'date' has been successfully parsed
		 String result[] = {input, String.valueOf(isValid)};
		 return result;
		}

	public String getDate() {
		 boolean isValid = false;
		 String result[] = {"", ""};
		 while (!isValid) {
			 result = parse(getUserInput());
			 isValid = Boolean.valueOf(result[1]);
		 }
		 return result[0];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParseDate8 parseDate = new ParseDate8();
		System.out.println(parseDate.getDate());

	}

}
