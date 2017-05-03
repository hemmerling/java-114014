package klassen.geometrie;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class AufgabeVererbung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 1;
		AufgabeVererbung aufgabeVererbung = new AufgabeVererbung(); 
		Rechteck rechteck = new Rechteck(3,4);
		System.out.println(rechteck.display());
		rechteck.bewegen( 12, -7);
		System.out.println(rechteck.display());

		Kreis kreis = new Kreis(4);
		System.out.println(kreis.display());
		kreis.bewegen(33, 1);
		System.out.println(kreis.display());

		System.out.println(kreis.getName());
		System.out.println(rechteck.getName());

	}
	
}