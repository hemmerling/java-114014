package collections.zoo;

public abstract class Tier implements KannBehandeltWerden{

	private boolean gesund = true;
	
	public void setGesund(boolean gesund){
		this.gesund = gesund;
	}
	
	public boolean isGesund(){
		boolean result = true;
		return result;
	}

	public String toString(){
		return this.getClass().toString();
	}
	
}
