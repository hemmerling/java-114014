package klassen.geometrie;

public /* abstract */ class GeometrischesObjekt {

	 public int x = 0;
	 public int y = 0;
	 public String name = "Geometrisches Objekt";
	 
	 public GeometrischesObjekt(){
		 this.x = 0;
		 this.y = 0;	 
	 }

	 public GeometrischesObjekt(int x, int y){
		 this.x = x;
		 this.y = y;	 
	 }
	 
	 public GeometrischesObjekt bewegen (int x, int y){
		 this.x = x;
		 this.y = y;
		 return this;
	 }
	 
	 public int[] getCoordinates(){
		 int[] result = { this.x, this.y };
		 return result;
	 }
	 
	public String display() {
		int[] coordinates = getCoordinates();
		String result = coordinates[0] + " " + coordinates[1]; 
		return result;
	}
	
	// public abstract int getFlaeche1();
	
	
	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
