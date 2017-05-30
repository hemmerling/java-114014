package io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Random;
import java.io.Console;

public class ArrayLoadSave {

	private String arrayFilePath = "C:/Users/Public/comcave_javacourse/array.txt";

	/*
	 *  Legen Sie bitte ein int-Array der Länge 'len' an 
	 *  und füllen Sie das Array mit Zufallswerten aus dem Bereich 0 bis 50:
	 *  int len = new java.util.Random().nextInt(100) + 1;
	 *  int[] arr1 = createArray(len);
	 */
	
	public String printArray(int[] array) {
		String result = "";
		for (int ii: array){
			result = result + String.valueOf(ii) + "\n";
		}
		return result;
	}

	public int[] fillArray(int[] array) {
		for (int ii=0; ii<array.length;ii++){
			array[ii] = new Random().nextInt(50);
		}
		return array;
	}
	
	public int[] saveArray(int[] arr1, String fileName){
		boolean result = true;
		Writer out = null;
		
		try {
			out = new FileWriter(fileName); // Writer <- IS-A <- FileWriter					
			for (int ii:arr1){
				out.write(ii);	
				System.out.println(ii);
			}			
			out.flush();
					
		} catch (IOException e) {
			System.out.println("Fehler! Kann die Datei entwender nicht öffnen oder nicht beschreiben");
			
		} finally {
			try {
				if(out!=null) {
					out.close(); //flush läuft bei close automatisch
				}
			} catch (IOException e) {
				System.out.println("Fehler! Kann die Datei nicht schliessen");
			}
		}		
		return arr1;
	}
	
	public int[] loadArray(String fileName){
		int[] result = null;
		Reader in = null;
		Reader in2 = null;
		
		try {
			in = new FileReader(fileName);

			// Get necessary array size
			int[] arr1;
			int ch;
			int arraySize = 0;
			while( (ch = in.read()) != -1 ) {
				arraySize +=1;
			}
				
	        in2 = new FileReader(fileName);
	        
			result = new int[arraySize];
			for (int ii=0; ii<result.length;ii++){
				ch = in2.read();
				result[ii] = ch;

			}
			
		} catch (IOException e) {
			System.out.println("Fehler! Kann die Datei entwender nicht öffnen oder nicht lesen");
			
		} finally {
			try {
				if(in!=null) {
					in.close();
				}
				if(in2!=null) {
					in2.close();
				}
			} catch (IOException e) {
				System.out.println("Fehler! Kann die Datei nicht schliessen");
			}
		}		
		return result;
	}
	
	/*
	 *  Laden Sie die Werte aus der Datei in ein neues int-Array:
	 *  int[] arr2 = loadArray("array.txt");
	 */

	public int[] generateArray(int size) {
		int len = new Random().nextInt(size) + 1;
		//System.err.println(len);
		int[] result = new int[len];
		result = fillArray(result);
		saveArray(result, arrayFilePath);
		return result;
	}
	
	public void batch(){
		final int SIZE = 5;
		int[] arr1 = generateArray(SIZE);
		System.out.println(printArray(arr1));
        System.out.println("******");
		saveArray(arr1, arrayFilePath);
		int[] arr2 = loadArray(arrayFilePath);
		System.out.println(printArray(arr2));
        System.out.println("******");	
	}
	
	/*
	 *  Erstellen Sie eine neue Konsolenanwendung in der der User entscheiden darf 
	 *  ob er ein int-Array erzeugen oder Laden möchte.
	 *  - Erzeugen. Es wird ein int[] mit Zufallswerten erzeugt 
	 *  und in einer Datei gespeichert. 
	 *  Die Anwendung fragt den User, wie groß das Array sein soll. Die Anwendung fragt den User, wie die Datei heißen soll, in der das Array gespeichert wird.
	 *  - Laden. Die Anwendung lädt ein int[] aus einer Datei und gibt es aus. 
	 *  Die Anwendung fragt den User, wie die Datei heißt.
	 */
	public void interactive(){
		Console console = System.console();	
        System.out.println("******");
		console.printf("Erzeugen(1) oder Laden(2) eines Integer-Arrays, Eingabe = ?");
		String eingabe = console.readLine();
		console.printf("eingegeben: #%s# %n", eingabe);
		if (eingabe.equals("2")) {
			console.printf("Name der Datei = ?");
			eingabe = console.readLine();
			int[] arr2 = loadArray(eingabe);
			System.out.println(printArray(arr2));
		} else if (eingabe.equals("1")) {
			console.printf("Arraygroesse = ?");
			eingabe = console.readLine();
			int size = Integer.valueOf(eingabe);
			int[] arr1 = generateArray(size);
			console.printf("Name der Datei = ?");
			eingabe = console.readLine();
	        saveArray(arr1, eingabe);
			
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLoadSave arrayLoadSave = new ArrayLoadSave();
		// arrayLoadSave.batch();
		arrayLoadSave.interactive();

	}

}
