package kontrollstrukturen;

import java.util.PriorityQueue;
import java.util.Queue;

public class AufgabeWhile {

	public Queue<Integer> aufgabeWhileInit1(Queue<Integer> queue) {
		queue.clear();
		queue.add(3);
		queue.add(-17);
		queue.add(55);
		return(queue);
	}

	public String aufgabeWhileOutput1(Queue<Integer> queue) {
		String result = "";
	
		while( !queue.isEmpty() ) {
			result = result + queue.poll() + " ";
		}
		result = result.trim();
		return ( result );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AufgabeWhile aufgabeWhile = new AufgabeWhile();
		Queue<Integer> queue = new PriorityQueue<>(); 
		// PriorityQueue = natural lexicographic ordering
		// Queue = insertion order
		System.out.println(aufgabeWhile.aufgabeWhileOutput1(aufgabeWhile.aufgabeWhileInit1(queue)));
		System.out.println(queue.toString());

		

	}

}
