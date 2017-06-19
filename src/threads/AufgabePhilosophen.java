package threads;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;

class RechteGabel {

	public synchronized void nimmtGabel(String ausgabe) {
		System.out.println(ausgabe);
	}
	
	public synchronized void legtGabelAb() {
	}

}

class Philosoph {
	
	private String name;
	
	Philosoph(String name) {
		this.name = name;
	}
		
	public String toString(){
		return this.name;
	}
}

class Philosophen  {
	
	private int anzahl;
	
	private List <String> philosophNamen = new ArrayList<String>(Arrays.asList("Heraklit", "Platon", "Sokrates"));
	private List<Philosoph> philosophen = new ArrayList<Philosoph>();
	
	Philosophen() {			 
	}
	
	public void setPhilosophen(int anzahl){
		this.anzahl = anzahl;
		philosophen = new ArrayList();
		for ( int ii=0; ii<anzahl; ii++){
			if (ii<philosophNamen.size()) {
				philosophen.add(new Philosoph (philosophNamen.get(ii)));				
			}
		}
	}

	public List<Philosoph> getPhilosophen(){
		return philosophen;
	}
}

class TagesAblauf implements Runnable {
	private Philosoph philosoph;

	static Object linkeGabel = new Object();
	static Object rechteGabel = new Object();
	
	private List <String> taetigkeiten = 
			new ArrayList<String>(Arrays.asList("denkt nach...", 
												"hat Hunger", 
												"nimmt die linke Gabel",
												"nimmt die rechte Gabel",
												"isst..",
												"legt die rechte Gabel ab",
												"legt die linke Gabel ab"
												));
	
	TagesAblauf(Philosoph philosoph) {
		this.philosoph = philosoph;
	}

	public void run() {
		while (true){
			System.out.println(philosoph.toString() + " " + taetigkeiten.get(0));
			System.out.println(philosoph.toString() + " " + taetigkeiten.get(1));
			synchronized (linkeGabel) {
				System.out.println(philosoph.toString() + " " + taetigkeiten.get(2));
				synchronized (rechteGabel) {
					System.out.println(philosoph.toString() + " " + taetigkeiten.get(3));
					System.out.println(philosoph.toString() + " " + taetigkeiten.get(4));
					System.out.println(philosoph.toString() + " " + taetigkeiten.get(5));
				}
				System.out.println(philosoph.toString() + " " + taetigkeiten.get(6));	
			}

//			for (int ii = 0; ii < taetigkeiten.size(); ii++) {
//					System.out.println(philosoph.toString() + " " + taetigkeiten.get(ii));
//			}
			
		}
	}
}
public class AufgabePhilosophen {

	public static void main(String[] args) {

		List <Runnable> runnableList = null;
		List <Thread> threadList = null;
		int anzahl = 3;
		AufgabePhilosophen aufgabePhilosophen = new AufgabePhilosophen();
		Philosophen philosophen = new Philosophen();
		philosophen.setPhilosophen(anzahl);
		System.out.println(philosophen.getPhilosophen());

		for(int ii = 0; ii<anzahl;ii++){
			Philosoph philosoph = philosophen.getPhilosophen().get(ii);
			System.out.println(philosoph);
			Runnable runnable = new TagesAblauf(philosoph);
			Thread thread = new Thread(runnable);
			thread.start();
		}
		
//		Philosoph philosoph = new Philosoph("Heraklit");
//		Runnable runnable = new TagesAblauf(philosoph);		
//		Thread p1 = new Thread(runnable);
//		p1.start();
		
		// TODO Auto-generated method stub

	}

}
