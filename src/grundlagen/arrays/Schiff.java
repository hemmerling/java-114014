package grundlagen.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Schiff {

	private String namen;
	
	public Schiff(){
	};

	public Schiff(String namen){
		this.namen = namen;
	};

	public String getName(){
		return(this.namen);
	};

	public void setName(String namen){
		this.namen = namen;
	};

	public static void main(String[] args) {
		Schiff schiff = new Schiff("Rickmer-Rickmers");
		System.out.println(schiff.getName());
		// TODO Auto-generated method stub

	}

}
