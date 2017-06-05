package collections;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FileTypes {

	String pathString ="";
	private File directory;

	private FileFilter fileFilter = new FileFilter() {
		public boolean accept(File pathname) {
			return pathname.isFile();
		}
	};
	
	// Definieren Sie einen Konstruktor für die Klasse 'FileTypes', an den man ein String übergeben kann:
	FileTypes(String pathString) {
		this.pathString = pathString;
		this.directory = new File(pathString);		
	}
	
	Collection<String> getFileTypes(){
		Collection<String> result = new HashSet<String>();
		
		File[] fileList = directory.listFiles(fileFilter);
		try {
			for (File ii:fileList) {
			    int aIndex = ii.toString().lastIndexOf('.');
				String aString = ii.toString().substring(aIndex);
				result.add(aString);
				//System.out.println(result);
			}
		} catch ( Exception e ) {
			System.err.println("Illegal Path - Path doesnt´exist");
		}
				
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String aPath = "C:\\Windows";
	FileTypes ft = new FileTypes(aPath);
	Collection<String> extColl = ft.getFileTypes();
	System.out.println(extColl.toString());
	}

}
