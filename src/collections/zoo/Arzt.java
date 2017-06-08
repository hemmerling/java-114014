package collections.zoo;

public class Arzt extends Mensch {
	/*    - Es ist möglich, einen Arzt zu erzeugen, 
	 *      der nur Affen behandeln kann (aber keine anderen Tiere)	
	 */
	public void behandeltAffen(Affe affe) {		
	}

	/*  - Es ist möglich, einen Arzt zu erzeugen, 
	 *  der beliebige Tiere behandeln kann (aber keine Menschen)
	 */
	public void behandeltTiere(Tier tier) {		
	}

	/*  - Es ist möglich, einen Arzt zu erzeugen, 
	 *  der sowohl Tiere als auch Menschen behandeln kann
	 */
	public void behandeltMenschenUndTiere(KannBehandeltWerden menschTier) {		
	}

	public static void main(String[] args) {
		Arzt arzt = new Arzt();
		arzt.behandeltAffen(new Affe());
		//arzt.behandeltAffen(new Zebra());
		//arzt.behandeltAffen(new Mensch());

		arzt.behandeltTiere(new Affe());
		arzt.behandeltTiere(new Zebra());
		//arzt.behandeltTiere(new Mensch());

		arzt.behandeltMenschenUndTiere(new Affe());
		arzt.behandeltMenschenUndTiere(new Zebra());
		arzt.behandeltMenschenUndTiere(new Mensch());

    }
}
