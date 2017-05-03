package klassen.geometrie;

import java.util.LinkedList;
import java.util.Queue;

public class Rechteck extends GeometrischesObjekt {
	
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

	public static void main(String[] args) {
		Rechteck rechteck = new Rechteck(5,3);
		rechteck.name = "Rechteck";
		System.out.println(rechteck.getMasze());
		rechteck = new Rechteck(2,4);
		System.out.println(rechteck.getMasze());
		// TODO Auto-generated method stub

	}

}
