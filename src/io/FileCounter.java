package io;

import java.io.File;
import java.io.FileFilter;

public class FileCounter {

	private String pathString;
	private String aTextFilter;
	private File directory;
	
	/*
	 *  Idee Testverzeichnis anzulegen, 
	 *  um für UnitTest durchführung zu wissen, was das Ergebnis ist
	 */
	
	/*
	 *  - Erzeugen Sie in der main-Methode der Klasse Test ein Objekt vom Typ 'FilesCounter':
	 * FilesCounter fc = new FilesCounter("C:\\Windows");
	 * Dabei wird als Argument ein Verzeichnisname übergeben.
	 */
	public FileCounter( String pathString ){
		this.pathString = pathString;
			this.directory = new File(pathString);		
	}
	

	private FileFilter fileFilter = new FileFilter() {
		public boolean accept(File pathname) {
			return pathname.isFile() && pathname.toString().toLowerCase().endsWith("."+aTextFilter);
		}
	};

	private FileFilter directoryFilter = new FileFilter() {
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
		File[] fileList = directory.listFiles(fileFilter);
		try {
			result = fileList.length;
		} catch ( Exception e ) {
			System.err.println("Illegal Path - Path doesnt´exist");
		}
		return result;
	}	

	public int count2 (String aTextFilter) throws Exception {
		int result = 0;
		this.aTextFilter = aTextFilter;
		File[] fileList = directory.listFiles(fileFilter);
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
		File[] fileList = directory.listFiles(fileFilter);
		if (fileList != null) {
			/* Lesbares Verzeichnis.
			 * Achtung unter Windows7 und später gibts unlesbare Verzeichnisse 
			 * z.b. Unterordner unter C:\\Windows 
			 */
			result = fileList.length;
			File[] directoryList = directory.listFiles(directoryFilter);
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
