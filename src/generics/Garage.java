package generics;

interface Fahrzeug {}

class Pkw implements Fahrzeug {}
class Lkw implements Fahrzeug {}

/*Realisieren Sie eine Klassen-Bibliothek mit Generics nach folgenden Beschreibungen: 

- Es kann PKWs geben, ein PKW ist ein Fahrzeug

- Es kann LKWs geben, ein LKW ist ein Fahrzeug

- LKW ist kein PKW

- Es kann Garagen für PKWs oder LKWs geben

- Garage für PKW ist KEINE Garage für LKW

- In eine Garage kann nur ein Fahrzeug reinfahren (Methode 'reinfahren' in der Klasse Garage mit einem Parameter). Also: nur Fahrzeuge werden in einer Garage akzeptiert 

- In eine Garage für LKWs darf nur ein LKW reinfahren (kein PKW).

- In eine Garage für PKWs darf nur ein PKW reinfahren (kein LKW).
*/

/*
 * Definition der generischen Klasse
 */
class Garage <T extends Fahrzeug> { //type-bounds:  Beschreibung der IS-A-Beziehung
	T fahrzeug;
	
	void reinfahren(T fahrzeug) {
		this.fahrzeug = fahrzeug;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pkw pkw = new Pkw();
		Lkw lkw = new Lkw();
		Garage<Pkw> garagePkw = new Garage<Pkw>();
		Garage<Lkw> garageLkw = new Garage<Lkw>();
		Garage garageLkwPkw = new Garage();
		//Garage<Lkw> garageLkw2 = new Garage<Pkw>();
		garagePkw.reinfahren(pkw);
		garageLkw.reinfahren(lkw);
		//garagePkw.reinfahren(lkw);
		garageLkwPkw.reinfahren(pkw);
		garageLkwPkw.reinfahren(lkw);
	}

}
