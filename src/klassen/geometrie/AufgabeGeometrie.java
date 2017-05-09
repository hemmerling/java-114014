package klassen.geometrie;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Arrays;

public class AufgabeGeometrie {

	final int min = 1;
	final int max = 20;
	Random r = new Random(); 

	private Kreis[] createKreise2(int amount) {
		Kreis[] kreise = new Kreis[amount];
		for ( int ii = 0; ii<amount; ii++){
			int radius = (min + this.r.nextInt(max-min+1));
			kreise[ii] = new Kreis(radius);
		}
		return kreise;
	}
	private Rechteck[] createRechtecke2(int amount) {
		Rechteck[] rechtecke = new Rechteck[amount];
		for ( int ii = 0; ii<amount; ii++){
			int hoehe = (min + this.r.nextInt(max-min+1));
			int breite = (min + this.r.nextInt(max-min+1));
			rechtecke[ii] = new Rechteck(hoehe,breite);
		}
		return rechtecke;
	}
	
	private Queue<Rechteck> createRechtecke1(int amount) {
		Queue<Rechteck>rechtecke = new LinkedList<Rechteck>();
		for ( int ii = 0; ii<amount; ii++){
			int hoehe = (min + this.r.nextInt(max-min+1));
			int breite = (min + this.r.nextInt(max-min+1));
			Rechteck rechteck = new Rechteck(hoehe,breite);
			rechtecke.add(rechteck);
		}
		return rechtecke;
	}
	
	private String displayRechtecke1(Queue<Rechteck> rechtecke) {
		String result = "";
		int jj = 1;
		while( !rechtecke.isEmpty() ) {
			Rechteck rechteck = rechtecke.poll();
			result = result + jj++ + ". Rechteck (" + 
					 rechteck.getHoehe() + " x " + rechteck.getBreite() + ")\n";
		};
		return result;
	}

	private String displayKreise2(Kreis[] kreise) {
		String result = "";
		int jj = 1;
		for (int ii = 0; ii< kreise.length; ii++) {
			result = result + jj++ + ". Kreis (" + 		
					 kreise[ii].radius + ")\n";
		}
		return result;
	}

	private String displayRechtecke2(Rechteck[] rechtecke) {
		String result = "";
		for (int ii = 0; ii< rechtecke.length; ii++) {
			result = result + ii++ + ". Rechteck (" + 		
					 rechtecke[ii].getHoehe() + " x " + rechtecke[ii].getBreite() + ")\n";
		}
		return result;
	}
	
	private int getFlaecheRechtecke1(Queue<Rechteck> rechtecke) {
		int result = 0;
		while( !rechtecke.isEmpty() ) {
			Rechteck rechteck = rechtecke.poll();
			result = result + rechteck.getFlaeche();
		};
		return result;
	}
	
	private void sortKreise2(Kreis[] kreise) {
		/* 
		 *  Error message:
		 *  klassen.geometrie.Kreis cannot be cast to java.lang.Comparable
		 */
		//Arrays.sort(kreise);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 4;
		AufgabeGeometrie aufgabeGeometrie = new AufgabeGeometrie(); 
		Queue<Rechteck>rechtecke1 = new LinkedList<Rechteck>();
		rechtecke1 = aufgabeGeometrie.createRechtecke1(amount);
		System.out.println(aufgabeGeometrie.displayRechtecke1(rechtecke1));
		rechtecke1 = aufgabeGeometrie.createRechtecke1(amount);

		System.out.println(aufgabeGeometrie.getFlaecheRechtecke1(rechtecke1));

		Rechteck[] rechtecke2 = aufgabeGeometrie.createRechtecke2(amount);
		System.out.println(aufgabeGeometrie.displayRechtecke2(rechtecke2));

		Kreis[] kreise2 = aufgabeGeometrie.createKreise2(amount);
		System.out.println(aufgabeGeometrie.displayKreise2(kreise2));
		aufgabeGeometrie.sortKreise2(kreise2);
		System.out.println(aufgabeGeometrie.displayKreise2(kreise2));

	}

}
