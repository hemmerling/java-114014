package collections.zoo;

public class Arzt<T extends KannBehandeltWerden> extends Mensch  {
	 public void behandeln(T partient) {
		 partient.setGesund(true);			 
	 }
	 
	 public static void main(String[] args) {
		Arzt arzt = new Arzt();
		arzt.behandeln(new Affe());
		arzt.behandeln(new Zebra());
		arzt.behandeln(new Mensch());

		Arzt<Affe> arztFuerAffen = new Arzt();
		arztFuerAffen.behandeln(new Affe());
		//arztFuerAffen.behandeln(new Zebra());
		//arztFuerAffen.behandeln(new Mensch());

		Arzt<Tier> arztFuerTiere = new Arzt();
		arztFuerTiere.behandeln(new Affe());
		arztFuerTiere.behandeln(new Zebra());
		//arztFuerTiere.behandeln(new Mensch());

	 }
}