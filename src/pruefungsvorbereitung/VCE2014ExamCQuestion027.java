package pruefungsvorbereitung;

import java.io.*;

class DOS {
	public void renameDirectory() {
		File dir = new File("dir");
		dir.mkdir();
		File f1 = new File(dir, "f1.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) { ; }
			File newDir = new File("newDir");
			dir.renameTo(newDir);
		}

	}

public class VCE2014ExamCQuestion027 {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOS dos = new DOS();
		dos.renameDirectory();
	}

}


