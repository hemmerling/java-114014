package grundlagen.arrays;

public class Hafen {

	private Schiff[] schiffe;
	private int maxCapacity = 100;
	
	public Hafen(){	
	}

	public Hafen(int numberOfShips){
		this.schiffe = new Schiff[numberOfShips];
	}

	public Schiff[] getSchiffe(){
		return(this.schiffe);
	};
	
	public void setSchiffe(int numberOfShips){
		this.schiffe = new Schiff[numberOfShips];
	}

	public String getHafen(){
		return("Hafen (Schiffe: " +schiffe.length + ". Freie Plätze: " +
	           (this.maxCapacity - schiffe.length) +")");
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hafen hafen = new Hafen(12);
		System.out.println(hafen.schiffe.length);
		System.out.println(hafen.getHafen());
	    

	}

}
