package collections;

import java.util.Set;
import java.util.TreeSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AbfahrtZeiten {

	Set<String> abfahrtzeitenSet = new TreeSet<String>();
	SimpleDateFormat format1 = new SimpleDateFormat("HH:mm");  
	
	
	/*
	 *  - Generieren Sie bitte die Abfahrtzeiten für eine Buslinie von einer Haltestelle:
	 *  - Der erste Bus fährt um 06:12 ab.
	 *  - Der letzte Bus fährt um 23:52 ab.
	 *  - Die Busse fahren in 20-Minuten-Takt
	 *  - Die Abfahrtzeiten sollen als Strings in einem TreeSet gespeichert werden. 
	 *  Die Strings sollen folgende Form haben: "06:12", "06:32", "06:52" ... "23:52"
	 */
	
	public Date nextAbfahrzeit(Date date, Date distance) {
		long newDate = date.getTime() + distance.getTime();
	    Date d4 = new Date(newDate);
	    System.out.println(date.toString());
	    System.out.println(distance.toString());
	    System.out.println(d4.toString());
		return d4;
	}
	
	public void addAbfahrzeit(String aString) {
		abfahrtzeitenSet.add(aString);
	}

	public void generiereAbfahrplan(String ersteAbfahrt, String letzteAbfahrt) {

		Date d1 = null;
		Date d2 = null;
		Date d3 = null;
		try {
		    d1 = format1.parse(ersteAbfahrt);
		    d2 = format1.parse(letzteAbfahrt);
		    d3 = format1.parse("00:20");
		} catch (ParseException e) {
		    e.printStackTrace();
		}   
		addAbfahrzeit(format1.format(d1));
		d1 = nextAbfahrzeit(d1,d3);
		addAbfahrzeit(format1.format(d1));
		d1 = nextAbfahrzeit(d1,d3);
	    addAbfahrzeit(format1.format(d1));
	}	
	
	public String toString() {
		return abfahrtzeitenSet.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ersteAbfahrt = "06:12";
		String letzteAbfahrt = "23:52";
		AbfahrtZeiten abfahrtZeiten = new AbfahrtZeiten();
		abfahrtZeiten.generiereAbfahrplan(ersteAbfahrt, letzteAbfahrt);
		System.out.println(abfahrtZeiten.toString());
	}

}
