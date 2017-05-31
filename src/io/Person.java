package io;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Person implements Serializable {

	public String name;
	public String geburtsjahr;
	private String fileName = "C:/Users/Public/comcave_javacourse/person.dat";
	
	public String toString(){
		String result = name  + ", geboren: " + geburtsjahr;
		return result;
	}
	
	public void save(){
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(this);
		} catch ( FileNotFoundException e) {
			e.printStackTrace();		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
	}
	
	public Object load(){
		ObjectInputStream ois;
		Person result = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			result = (Person)ois.readObject();
			name = result.name;
			geburtsjahr = result.geburtsjahr;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch ( FileNotFoundException e) {
			e.printStackTrace();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		Person person2 = new Person();
		person1.name = "Max Mustermann";
		person1.geburtsjahr = "1969";
		person1.save();
		person2.load();
		System.out.println(person2.toString());
	}
}
