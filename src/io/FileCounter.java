package io;

import java.io.File;
import java.io.FileFilter;

public class FileCounter {

	String pathString;
	String aTextFilter;
	File directory;
	
	/*
	 *  - Erzeugen Sie in der main-Methode der Klasse Test ein Objekt vom Typ 'FilesCounter':
	 * FilesCounter fc = new FilesCounter("C:\\Windows");
	 * Dabei wird als Argument ein Verzeichnisname übergeben.
	 */
	FileCounter( String pathString ){
		this.pathString = pathString;
		this.directory = new File(pathString);
	}
	

	FileFilter filter1 = new FileFilter() {
		public boolean accept(File pathname) {
			return pathname.isFile() && pathname.toString().endsWith("."+aTextFilter);
		}
	};

	FileFilter filter2 = new FileFilter() {
		public boolean accept(File pathname) {
			return pathname.isDirectory();
		}
	};

    /*
     *  - Folgender Aufruf muss die Dateien im Verzeichnis 
     *  "C:\\Windows" (s. den Konstruktoraufruf) (aber nicht in Unterverzeichnissen) zählen:
     *  int anzahl = fc.count("txt");
     */
	public int count (String aTextFilter) {
		int result = 0;
		this.aTextFilter = aTextFilter;
		File[] fileList = directory.listFiles(filter1);
		result = fileList.length;
		return result;
	}	
	
	
	/*
	 *  Optional. Folgender Aufruf muss rekursiv die Dateien im Verzeichnis "C:\\Windows" 
	 *  (s. den Konstruktoraufruf) und allen Unterverzeichnissen zählen:
	 *  int anzahl = fc.countDeep("txt");
	 */
	public int countDeep2 (File directory) {
		int result = 0;
		this.aTextFilter = aTextFilter;
		File[] fileList = directory.listFiles(filter1);
		if (fileList != null) {
			/* Lesbares Verzeichnis.
			 * Achtung unter Windows7 und später gibts unlesbare Verzeichnisse 
			 * z.b. Unterordner unter C:\\Windows 
			 */
			result = fileList.length;
			File[] directoryList = directory.listFiles(filter2);
			for (File ii:directoryList){
				result +=countDeep2(ii);
			}
		}
		return result;
	}
	
	public int countDeep (String aTextFilter) {
		int result = 0;
		this.aTextFilter = aTextFilter;
		File[] directoryList = directory.listFiles();
		for (File ii:directoryList){
			result +=countDeep2(ii);
		}	
		return result;
	}	

	public static void main(String[] args) {
		String pathName = "/";
		pathName = "C:\\Windows";
		FileCounter fileCounter = new FileCounter(pathName);
		int numberOfFiles = fileCounter.count("exe");
		System.out.println(numberOfFiles);
		numberOfFiles = fileCounter.countDeep("exe");
		System.out.println(numberOfFiles);

		// TODO Auto-generated method stub

	}

}
