package klassen.geometrie;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class AufgabeGeometrie {

	final int min = 1;
	final int max = 20;
	Random r = new Random(); 
	
	private Queue<Rechteck> createRechtecke(int amount) {
		Queue<Rechteck>rechtecke = new LinkedList<Rechteck>();
		for ( int ii = 0; ii<amount; ii++){
			int hoehe = (min + this.r.nextInt(max-min+1));
			int breite = (min + this.r.nextInt(max-min+1));
			Rechteck rechteck = new Rechteck(hoehe,breite);
			rechtecke.add(rechteck);
		}
		return rechtecke;
	}
	
	private String displayRechtecke(Queue<Rechteck> rechtecke) {
		String result = "";
		int ii = 1;
		while( !rechtecke.isEmpty() ) {
			Rechteck rechteck = rechtecke.poll();
			result = result + ii++ + ". Rechteck (" + 
					 rechteck.getHoehe() + " x " + rechteck.getBreite() + ")\n";
		};
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 1;
		AufgabeGeometrie aufgabeGeometrie = new AufgabeGeometrie(); 
		Queue<Rechteck>rechtecke = new LinkedList<Rechteck>();
		rechtecke = aufgabeGeometrie.createRechtecke(100);
		System.out.println(aufgabeGeometrie.displayRechtecke(rechtecke));
	}

}
