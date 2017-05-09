package klassen.geometrie;

import java.util.LinkedList;
import java.util.Queue;

public class Rechteck extends GeometrischesObjekt implements FlaechenObjekt {
	
	private int hoehe;
	private int breite;

	public int getHoehe() {
		return this.hoehe;
	}

	public int getBreite() {
		return this.breite;
	}

	public int setHoehe(int hoehe) {
		this.hoehe = hoehe;
		return hoehe;
	}

	public int setBreite(int breite) {
		this.breite = breite;
		return breite;
	}

	public Rechteck ( int hoehe, int breite ) {
		this.hoehe = hoehe;
		this.breite = breite;
		this.name = "Rechteck";
	}
	
	public Queue<Integer> getMasze(){
		Queue<Integer> masze = new LinkedList<Integer>(); 
		masze.add(hoehe);
		masze.add(breite);
		return masze;
	}

	public int getFlaeche(){
		return this.hoehe * this.breite;
	}
	
	public static void main(String[] args) {
		int breite = 5;
		int hoehe = 3;
		Rechteck rechteck = new Rechteck(breite, hoehe);
		rechteck.name = "Rechteck";
		System.out.println(rechteck.getMasze());
		rechteck = new Rechteck(2,4);
		System.out.println(rechteck.getMasze());
		// TODO Auto-generated method stub

	}

}
