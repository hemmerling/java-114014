package io;
import java.io.File;
import java.nio.file.*;

public class FileIo {

	public File createFile (String pathString) {
		return  new File(pathString);
	}
	
	/*
	 *  Definieren Sie eine Methode `printSubdirs` mit dem Parameter 
	 *  von Typ `java.io.File` mit dem Namen `dir`.  
	 *  Die Methode soll für das Verzeichnis `dir` 
	 *  alle Unterverzeichnisse auf der Konsole auflisten.
	 *  Tipp: benutzen Sie Methoden `list` oder `listFiles` aus der Klasse `File`
	 */
	public String printSubdirs (File dir) {
		String result = "";
		File[] fileList;
		fileList = dir.listFiles();
		for(File ii: fileList) {
			if (ii.isDirectory()) {
				result += ii.toString() + "\n";			
			}
		}
		return result;
	}

	
    /*
     *  - Definieren Sie eine weitere Methode `printFiles` mit dem Parameter von Typ `java.io.File` 
     *  mit dem Namen `dir`. 
     *  Die Methode soll für ein Verzeichnis `dir` alle Dateien auf der Konsole auflisten.
     */
	public String printFiles (File dir) {
		String result = "";
		File[] fileList;
		fileList = dir.listFiles();
		for(File ii: fileList) {
			if (ii.isFile()) {
				result += ii.toString() + "\n";			
			}
		}
		return result;
	}

	/*
	 *  - Erstellen Sie ein Methode `createDirs(String)` 
	 *  die folgendermaßen aufgerufen werden kann:
	 *  createDirs("a\\b\\c\\d");
	 *   Die Methode erzeugt dann die beschriebene Verzeichnisstruktur.
	 */
	public boolean createDirs (File dir) {
		// boolean result =  dir.mkdirs(); // Single directory level
		boolean result =  dir.mkdirs(); // Multiple directory levels
		return result;
	}
	
	/*
	 *  - Erstellen Sie ine Methode `deleteDirs(String)` 
	 *  die folgendermaßen aufgerufen werden kann:
	 *  deleteDirs("a\\b\\c\\d");
	 *  Die Methode löscht dann die Verzeichnisse, 
	 *  aber nur wenn die keine weiteren Elemente beinhalten
	 *  
	 *  Für Rekursivität verwenden:
	 *  dir.getParent(), dir.getParentFile()
	 */
	public boolean deleteDirs (File dir) {
		boolean result =  dir.delete();
		return result;
	}

	public static void main(String[] args) {
		FileIo fileIo = new FileIo();
		File aPath = fileIo.createFile("/");
		String fileList = fileIo.printSubdirs(aPath);
		System.out.println(fileList);
		System.out.println("*********************");	
		fileList = fileIo.printFiles(aPath);
		System.out.println(fileList);
		System.out.println("*********************");	
		
		String path1 = "/users/public/12345678";
		String path2 = path1+"/new";
		File aPath1 = fileIo.createFile(path1);
		File aPath2 = fileIo.createFile(path2);
		boolean result = fileIo.createDirs(aPath2); 
		System.out.println(result);
		result = fileIo.deleteDirs(aPath2); 
		System.out.println(result);
		result = fileIo.deleteDirs(aPath1); 
		System.out.println(result);
		

		// TODO Auto-generated method stub

	}

}
