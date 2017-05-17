package grundlagen.enums;

enum Hunderasse { DACKEL, COLLIE, DOGGE };

public class Hund {

	Hunderasse hundeRasse;
	public final double maxGroesse;
	
	Hund(Hunderasse hundeRasse) {
	this.hundeRasse	= hundeRasse;
	switch (hundeRasse) {
		case DOGGE:
			maxGroesse = 1.5;
			break;
		case COLLIE:
			maxGroesse = 1.0;
			break;
		case DACKEL:
			maxGroesse = 0.5;
			break;
		default:
			maxGroesse = 0;
		}
	}
	
	@Override
	public String toString() {
		return  hundeRasse + ", max. Größe: " + maxGroesse;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub

	}

}
