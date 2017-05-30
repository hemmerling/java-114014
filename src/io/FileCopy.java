package io;

import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileCopy {
	
	public boolean copyTextFile(String sourceFilePath, 
		    				    String copyFilePath)  {
		FileCopy fileCopy = new FileCopy();
		boolean result = fileCopy.copyTextFile(sourceFilePath, copyFilePath, false);
		return result;
	}
	
	public boolean copyTextFile(String sourceFilePath, 
							    String copyFilePath, boolean append)  {
		boolean result = true;
		BufferedReader in=null;
		BufferedWriter out = null;

		FileReader in2=null;
		if (!append) {
			
			try {
				in2 = new FileReader(copyFilePath);
				result = false;
				System.out.println("Fehler! Es existiert schon eine Datei mit dem Namen der gewünschten Ziel-Datei");
			} catch (FileNotFoundException e) {
				result = true; // ok, destination doesn´t exist		
			} finally {
				try {
					if(in2!=null) {
						in2.close(); 
					}
				} catch (IOException e) {
					System.out.println("Fehler! Die Dateien konnten nicht geschlossen werden");
				}
			
			}

		}

		if (result) {
			
			try {
				in = new BufferedReader(new FileReader(sourceFilePath), 1024);
				out = new BufferedWriter(new FileWriter(copyFilePath, append), 1024);
				//out = new FileWriter(copyFilePath); // Writer <- IS-A <- FileWriter
				String line;
				
				while( (line = in.readLine()) != null ) {
					out.newLine();
					//System.out.println(line);
				}
	
			} catch (IOException e) {
				System.out.println("Fehler! Kann die Dateien nicht öffnen oder schreiben");
				result = false;			
			} finally {
				try {
					if(in!=null) {
						in.close();
					}
					if(out!=null) {
						out.close(); //flush läuft bei close automatisch
					}
				} catch (IOException e) {
					System.out.println("Fehler! Die Dateien konnten nicht geschlossen werden");
				}
			
			}
		
		}
		
		return result; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if ( args.length == 2 ) {
			FileCopy fileCopy = new FileCopy();
			String sourceFilePath = args[0];
			String copyFilePath = args[0];
			boolean result = fileCopy.copyTextFile(sourceFilePath, copyFilePath, false);
		} else {
			System.err.println("FileCopy sourceFilePath copyFilePath");
		}
	}

}
