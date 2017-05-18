package grundlagen.enums;

enum MuenzenMedallie { CENT10, CENT20, CENT50, EUR1, EUR2};

public class Muenze {
	
	MuenzenMedallie muenzenMedallie;
	public final double muenzwert;

	public double getMuenzwert() {
		return muenzwert;
	}

	Muenze(MuenzenMedallie muenzenMedallie) {
	this.muenzenMedallie = muenzenMedallie;
	switch (muenzenMedallie) {
		case CENT10:
			muenzwert = 0.1;
			break;
		case CENT20:
			muenzwert = 0.2;
			break;
		case CENT50:
			muenzwert = 0.50;
			break;
		case EUR1:
			muenzwert = 1.0;
			break;
		case EUR2:
			muenzwert = 2.0;
			break;
		default:
			muenzwert = 0.0;
		}
	}	
}