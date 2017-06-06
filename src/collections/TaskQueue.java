package collections;

import java.util.PriorityQueue;

enum AufgabenPriorität
{
  LOW, NORMAL, HIGH;
}

public class TaskQueue implements Comparable {

	public String aufgabenBeschreibung;
	public AufgabenPriorität aufgabenPriorität;
	public int termin;
	
	private PriorityQueue<TaskQueue> listeGeplanterAufgaben = new PriorityQueue<TaskQueue>();

	TaskQueue() {}

	TaskQueue(String aufgabe, AufgabenPriorität prioritaet) {
		this.aufgabenBeschreibung = aufgabe;
		this.aufgabenPriorität = prioritaet;
	}

	TaskQueue(String aufgabe, AufgabenPriorität prioritaet, int termin) {
		this.aufgabenBeschreibung = aufgabe;
		this.aufgabenPriorität = prioritaet;
		this.termin = termin;
	}

//	//@Override
//	public int compareTo2(Object o) {
//		// TODO Auto-generated method stub
//		TaskQueue t = (TaskQueue)o;
//		// Smaller "date" = more priority
//		final int result1 = Integer.compare(t.aufgabenPriorität.ordinal(), 
//                aufgabenPriorität.ordinal());
//		if (result1 != 0) {
//			return result1;
//		}
//		int result = Integer.compare(termin, t.termin);
//		return result;
//	}

	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		TaskQueue t = (TaskQueue)o;
		int result;
		result = t.aufgabenPriorität.ordinal() - aufgabenPriorität.ordinal();
		//result = Integer.compare(t.aufgabenPriorität.ordinal(), 
        //                         aufgabenPriorität.ordinal());
		System.out.println(t.aufgabenPriorität.ordinal() + " " + 
				   aufgabenPriorität.ordinal() + " " + result);
		return result;
	}

	public String toString(){
		return this.aufgabenBeschreibung + " " + aufgabenPriorität;
	} 
	
	public static void main(String[] args) {
		TaskQueue taskQueue = new TaskQueue();
//		taskQueue.listeGeplanterAufgaben.offer(new TaskQueue("Autowäsche",
//													       AufgabenPriorität.LOW));
		taskQueue.listeGeplanterAufgaben.offer(new TaskQueue("Einkaufen",
				   										   AufgabenPriorität.NORMAL));
		taskQueue.listeGeplanterAufgaben.offer(new TaskQueue("Rechnung bezahlen",
														   AufgabenPriorität.HIGH));
		taskQueue.listeGeplanterAufgaben.offer(new TaskQueue("Rechnung bezahlen",
				   AufgabenPriorität.LOW));
		taskQueue.listeGeplanterAufgaben.offer(new TaskQueue("Rechnung bezahlen",
				   										   AufgabenPriorität.LOW));

		System.out.println(taskQueue.listeGeplanterAufgaben);

		while( taskQueue.listeGeplanterAufgaben.isEmpty() ) {
			TaskQueue t = taskQueue.listeGeplanterAufgaben.poll();
			System.out.println(t);
		}
		// TODO Auto-generated method stub
		

	}


}
