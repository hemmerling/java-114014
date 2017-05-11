package klassen.innere;

public class Gebaeude {
	
	public final int MIN_STOCKWERKE_PER_GEBAEUDE = 1;
	public final int MIN_RAEUME_PER_STOCKWERK = 1;
	
	public static String strasse;
	public String nummer;
	public int stockwerkePerGebaeude = MIN_STOCKWERKE_PER_GEBAEUDE;
	public int raeumePerStockwerk = MIN_RAEUME_PER_STOCKWERK;
		
	public Stockwerk[] stockwerke;
	
	// non-static class
	public class Stockwerk {
		private Raum2[] raeume2;
		private Raum[] raeume;
		private int nummer;
		
		public Stockwerk(int nummer, int anzahlRaeumeProStockwerk) {
			this.nummer = nummer;
			this.raeume2 = new Raum2[anzahlRaeumeProStockwerk];
			for (int i = 0; i < raeume2.length; i++) {
				raeume2[i] = new Raum2(i);
			}
			this.raeume = new Raum[anzahlRaeumeProStockwerk];
			for (int i = 0; i < raeume.length; i++) {
				raeume[i] = new Raum(i);
			}
		}
		
		@Override
		public String toString() {
			return "Stockwerk " + nummer + " / " + strasse + " " + Gebaeude.this.nummer;
		}
	
		// Raum was allowed to be static class, until now
		public /* static */ class Raum {
			private int nummer;
			
			public Raum(int nummer) {
				this.nummer = nummer;
			}

			@Override
			public String toString() {
				String result = "Raum "  + nummer + "." + Stockwerk.this.nummer + 
						        " / " + strasse + " " + Gebaeude.this.nummer;
				// String result = "Raum " + nummer; 
				return result;
			}
		}
	}

	// Raum was allowed to be static class, until now
	public /* static */ class Raum2 {
		private int nummer;
		
		public Raum2(int nummer) {
			this.nummer = nummer;
		}

		@Override
		public String toString() {
			String result = "Raum " + nummer; 
			return result;
		}
	}
	
	public Gebaeude(String strasse, String nummer, 
			int anzahlStockwerke, int anzahlRaeumeProStockwerk) {
		
		this.strasse = strasse;
		this.nummer = nummer;
		
		stockwerke = new Stockwerk[anzahlStockwerke];
		for (int i = 0; i < stockwerke.length; i++) {
			stockwerke[i] = new Stockwerk(i, anzahlRaeumeProStockwerk);
		}
		
	}
	
	public Stockwerk getStockwerk(int stockwerkNr){
		return this.stockwerke[stockwerkNr];	
	}
	
	public Raum2 getRaum2(int stockwerkNr, int raumNr) {
		return this.stockwerke[stockwerkNr].raeume2[raumNr];
	}

	@Override
	public String toString(){
		return "Gebäude";    	
    }
	
	public static void main(String[] args) {
		Gebaeude gebaeude = new Gebaeude ("Hauptstr", "45", 3 , 10);
		System.out.println(gebaeude.getRaum2(0, 2));
		System.out.println(gebaeude.getStockwerk(0));

		// TODO Auto-generated method stub

	}

}
