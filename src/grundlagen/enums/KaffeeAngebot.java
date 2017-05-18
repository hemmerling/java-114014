package grundlagen.enums;

import java.util.Scanner;
import java.io.Console;

enum KaffeeSorte { KAFFEE, CAPPUCCINO, ESPRESSO };

public class KaffeeAngebot {

	KaffeeSorte kaffeeSorte;
	public final double preis;

	public double getPreis() {
		return preis;
	}

	KaffeeAngebot() {
		this.preis = 0;
	}

	KaffeeAngebot(KaffeeSorte kaffeeSorte) {
	this.kaffeeSorte = kaffeeSorte;
	switch (kaffeeSorte) {
		case KAFFEE:
			preis = 1;
			break;
		case CAPPUCCINO:
			preis = 1.2;
			break;
		case ESPRESSO:
			preis = 1.13;
			break;
		default:
			preis = 0;
		}
	}
	
	@Override
	public String toString() {
		return  this.kaffeeSorte + " = " + this.preis + " EUR";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
