package pruefungsvorbereitung;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class VCE2014ExamBQuestion004 {
	
	public static void main(String[] args) {
		Date date = new Date();
		int style = DateFormat.MEDIUM;
		DateFormat df;
		df = DateFormat.getDateInstance(style, Locale.ITALY);
		//df.setLocale(Locale.ITALY);
		String s = df.format(date);
		System.out.println(s);
	}

}
