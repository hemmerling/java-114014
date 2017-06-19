package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Broetchen {
}

class Person implements Runnable {
	private String name;
	private Baeckerei lieblingsBaeckerei;
	int MIN = 3;
	int MAX = 15;
	Random randomGenerator = new Random();
	
	Person(String name, Baeckerei lieblingsBaeckerei){
		this.name = name;
		this.lieblingsBaeckerei = lieblingsBaeckerei;
	}
	
	public void einkaufen() {
		int gewuenschteBroetchenZahl = MIN + randomGenerator.nextInt(MAX-MIN); 
		int erhalteneBroetchen = 
				lieblingsBaeckerei.verkaufeBroetchen(gewuenschteBroetchenZahl);
		if (erhalteneBroetchen>0) {
			System.out.println("Einkauf, Wunsch:" + gewuenschteBroetchenZahl + 
		            ", Lieferung:" + erhalteneBroetchen);		
		} else {
			System.out.println("Erfolgloser Einkauf");
		}

	}

	private void sleeping(){
		synchronized (lieblingsBaeckerei.monitor) {
			try {
				lieblingsBaeckerei.monitor.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
	
	public void run() {
		while(true){
			einkaufen();
			sleeping();
		}
	}
}

public class Baeckerei implements Runnable {

	private String name;
	private int lagerKapazitaet = 100;
	private int batchKapazitaet = 10;
	private int produzierteBroetchen = 0;
	private List<Broetchen> lager = new ArrayList<Broetchen>();

	public Object monitor = new Object();
	
	Baeckerei(String name, int lagerKapazitaet, int batchKapazitaet) {
		this.name = name;
		this.lagerKapazitaet = lagerKapazitaet;
		this.batchKapazitaet = batchKapazitaet;
	}

	Baeckerei(String name, int lagerKapazitaet) {
		this.name = name;
		this.lagerKapazitaet = lagerKapazitaet;
	}

	Baeckerei(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name + " Produziert:"+this.produzierteBroetchen;
	}

	private void produziereBatch() {
		synchronized(monitor) {
			if ( this.produzierteBroetchen + this.batchKapazitaet < this.lagerKapazitaet) {
				this.produzierteBroetchen += batchKapazitaet;
			} else {
				this.produzierteBroetchen = this.lagerKapazitaet;
			}
			monitor.notify();
		}
		System.out.println(this.toString());			
	}
	
	public int verkaufeBroetchen(int gewuenschteBroetchenZahl) {
		int result;
		synchronized(monitor) {
			if (this.produzierteBroetchen > gewuenschteBroetchenZahl) {
				result = gewuenschteBroetchenZahl;
				this.produzierteBroetchen -= gewuenschteBroetchenZahl;
			} else {
				result = produzierteBroetchen;
				this.produzierteBroetchen = 0;
			}			
		}
		return result;
	}

	private void sleeping(){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void run() {
		while(true){
			produziereBatch();
			sleeping();
		}
	}
	
	public static void main(String[] args) {
		Baeckerei ba1 = new Baeckerei("Meier", 100, 10);
		Runnable baeckerei1 = ba1; 
		Baeckerei ba2 = new Baeckerei("Mueller", 50, 5);
		Runnable baeckerei2 = ba2; 
		Runnable person1 = new Person("Hans Meier", ba1);
		Runnable person2 = new Person("Klaus Mueller", ba2);
		
		Thread b1 = new Thread(baeckerei1);
		Thread b2 = new Thread(baeckerei2);

		Thread p1 = new Thread(person1);
		Thread p2 = new Thread(person2);
		
		b1.start();
		b2.start();
		
		p1.start();
		p2.start();

	}

}
