package pruefungsvorbereitung;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class VCE2014ExcamCQuestion196 {
	public static void main(String[] args) {
		Date date = new Date();
		Locale locale = Locale.ITALY;
		//df.setLocale(locale);
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String s = df.format(date);	
		System.out.println(s);
	}
}
