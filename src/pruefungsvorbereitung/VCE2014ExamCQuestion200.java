package pruefungsvorbereitung;
import java.io.*;

class Animal {
	Animal() { System.out.print("a"); }
}

class Dog extends Animal implements Serializable {
	Dog() { System.out.print("d"); }
}

class Beagle extends Dog { }

public class VCE2014ExamCQuestion200 {

	public Beagle beagle;

	public void write2() {
		OutputStream outputStream = null;
		try
		{
			// Byteorientierten Ausgabekanal Öffnen
			outputStream = new FileOutputStream("data.ser");

			// Objektausgabekanal für Serialisierung Öffnen
			ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);

			// Objekte serialisiert in Datei ausgeben
			objectOutput.writeObject(beagle);

			// Ausgabekanal schließen
			objectOutput.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				outputStream.close();
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public void read2()
	{
		try
		{
			// Serialisiertes Objekt
			FileInputStream inputStream = new FileInputStream("data.ser");
			// Deserialisierung
			ObjectInputStream objectInput = new ObjectInputStream(inputStream);
			// Beagle auslesen
			beagle = (Beagle) objectInput.readObject();
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// If an instance of class Beagle is created, then Serialized, 
		// then deSerialized, what is the result?
		VCE2014ExamCQuestion200 test = new VCE2014ExamCQuestion200();
		test.beagle = new Beagle(); // "ad"
		test.write2();
		test.read2(); / "a"
	}
}

