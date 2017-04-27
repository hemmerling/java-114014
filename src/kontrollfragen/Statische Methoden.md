# Kontrollfragen 'statische Methoden'

- Warum gibt es Methoden (in anderen Sprachen Funktionen, Prozeduren)?
Zur Datenverarbeitung
- Woraus besteht jede statische Methode (Name, Parameterliste...)?
1. Typ des Rückgabewertes ( void,..)
2. Name
3. Parmeterliste mit Name und Typ
4. Body {}
- Was ist eine Methoden-Signatur?
 Name + Liste der Parametertypen 
 ??? wie in C nach alten Standards?   
- Was ist eine lokale Variable? Wo ist sie gültig? Soll sie initialisiert werden?
Sie ist in ihrem Block / ihrer Methode gültig.
Sie ist bei Definition nicht initialisiert.
- Was ist eine Blockvariable? Wo ist sie gültig?
Sie ist in ihrem Block gültig.
Sie ist bei Definition nicht initialisiert.  
- Legen Sie bitte in einer Methode zwei Variablen mit demselben Namen an.
class a(){
	int b;
	void c(){
		int b;
	}
}
- Wozu gibt es Parameter?
Um Funktionene bei Aufruf bzw. Klassen bei Generierung zu instrumentatlisieren
- Gibt es für Sie den Unterschied zwischen einem Parameter und einem Argument?
Formaler Parameter x: 
myfunction(int x){
}
Argument: tatsächlicher Parameter in Programmen:
myFunction(5);
http://de.wikipedia.org/wiki/Argument_(Begriffskl%C3%A4rung)
http://de.wikipedia.org/wiki/Parameter_(Informatik)#Argumente
- Kann man lokale Variablen und Parameter vergleichen?
Gleicher Gültigkeitsbereich
In Java ( Value-Parameter ) gilt für beide die gleiche Datenkapselung: Äußeres kann nicht verändert werden   
- In welchen Zeilen ist Casting überflüssig?
  
	static short foo(byte b) {
	    return (short) 2;			// Zeile A, Casting überflüssig
	}
	
	static void test() {
	    byte b = (byte) 2;		// Zeile B, Casting überflüssig
	
	    foo((byte) 2);				// Zeile C
	}   
- Was ist Stack?
 https://de.wikipedia.org/wiki/Stapelspeicher
   
- Wie kann man aus einer Methode die lokale Variable einer anderen Methode auslesen?
???
Nur über mit this.x angesprochener Klassenvariable ?!
Oder Wert zurückggeben mit return.
   
- Was ist Überladen? Überladen Sie eine Methode mehrfach. Rufen Sie alle überladenen Methoden auf.
class a(){
	void b(){
	}
	void b(int d){
	}
	void c(int d, int e){
	}

	public static void main(String[] args) {
		b();
		b(5);
		b(5,6);	
	}

}
   
- Was bekommt man mit statischen Variablen? Sollen sie initialisiert werden?
Klassen-Variablen, für alle Instanzen der Klasse gleich
Einmalige Initialisierung, am besten bei der Definition
Berücksichtigen dass diese Wert für alle Instanzen gilt

- Liegen statische Variablen auf dem Stack?
Nein
- Greifen Sie in einer statischen Methode der Klasse A auf eine statische Variable der Klasse B zu.
class a(){
	static int b = 5;
}
class c(){
	a.b = 5;
}
- Was ist ein rekursiver Aufruf?
class a(){
	int b(int d){
	 b(d);
	}
   
- Führen Sie eine Test-Anwendung zum StackOverflowError
class a(){
	int b(int c){
	 b(c);
	public static void main(String[] args) {
		new a.b(5);
	}

