package io;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class FileReading {

	public String readingJava6(String fileName) {

		BufferedReader input = null;
		String result = "";
		
		try {
			input = new BufferedReader(new FileReader(fileName));
		    StringBuilder sb = new StringBuilder();
		    String line = input.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = input.readLine();
		    }
		    result = sb.toString();
			
		} catch (IOException e) {
			System.err.println("Fehler im try! Kann die Datei entwender nicht öffnen oder nicht lesen");
			
		} finally {
			try {
				input.close(); //flush läuft bei close automatisch
			} catch (IOException e) {
				System.err.println("Fehler! Kann die Datei nicht schliessen");
			}
		}
	    return result;

	}
	
	public String readingJava8(String fileName) {

		// Java 8 (nicht in der Prüfung):
		// try-with-resources
		BufferedReader input = null;
		String result = "";
		try(Reader r = new FileReader(fileName)) {
			input = new BufferedReader(new FileReader("c:/users/public/12345678.txt"));
		    StringBuilder sb = new StringBuilder();
		    String line = input.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = input.readLine();
		    }
		    result = sb.toString();

		} catch (IOException e) {
			System.err.println("Fehler entweder beim Öffnen oder Benutzen oder Schliessen");
		} // hier gibt es implizit finally mit w.close()
		
	    return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReading fileReading = new FileReading();
		String fileName = "c:/users/public/12345678.txt";
		System.out.println(fileReading.readingJava6(fileName));
		System.out.println(fileReading.readingJava8(fileName));
	}

}

