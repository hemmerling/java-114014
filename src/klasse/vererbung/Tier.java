package klasse.vererbung;

public abstract class Tier {

	String name;
	int alter;
	boolean gesund;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public boolean isGesund() {
		return gesund;
	}

	public void setGesund(boolean gesund) {
		this.gesund = gesund;
	}

	/*
	 *  Abstract methods do not specify a body
	 *  The abstract method laufen in type Tier can only be defined by an abstract class
	 *  Syntax error, insert ";" to complete MethodDeclaration
	 */
	public abstract String laufen();

	public String print(){
		return this.getClass().getSimpleName()+". Name: "+this.name;
	}

}
