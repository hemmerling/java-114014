package maps;

public class Auto {

		String modell;
		String hersteller;
		
		Auto( String modell, String hersteller) {
			this.modell = modell;
			this.hersteller = hersteller;
		}

		public String toString() {
			return this.modell + " " + this.hersteller;
		}

}
