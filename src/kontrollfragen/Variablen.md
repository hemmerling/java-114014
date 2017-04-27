# Kontrollfragen 'Variablen'

## Elementare Datentypen

- Nennen Sie alle numerischen Datentypen und ihre Größen in Byte. 
byte, 1
short, 2
int, 4
long, 8
float, 4
double, 16
https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen#float
- Nennen Sie den Typ für Zeichen und seine Größe in Byte.
char, 2
- Nennen Sie den booleschen Typ.
boolean, 1

## Literale, bezeichner, Schlüsselwörter

- Was ist ein Schlüsselwort?
Es darf nicht für Namen von Bezeichnern verwendet werden.
https://www.sonntag.cc/teaching/JAVA-Kurs/appendices/Schluesselwoerter.htm   
- Datentypen
- Anweisungen
- Abbruch-Anweisungen
- Methoden
- Zugriffsregelung
- Pakete
- Klassen
- Variablen-Kennzeichnung
- Derzeit nicht verwendet und reserviert

- Was ist ein Bezeichner (Identifier)? Mit welchen Zeichen kann man einen gültigen Identifier erstellen?
   
https://de.wikibooks.org/wiki/Java_Standard:_Variablen_und_Bezeichner
Bezeichner (engl.: Identifier) bezeichnen in Java Klassen, Interfaces, Variablen (bzw. Objekte), Methoden und Konstanten. Bezeichner sind also, einfach gesprochen, die Namen der zuvor genannten Elementen

   
- Was ist ein Literal?
http://www.straub.as/java/basic/const.html
ein Literal ist ein konstanter Wert. Und diese Werte haben einen bestimmten Datentyp
   
- Nennen Sie Beispiele für die möglichen ganzzahligen Literale (dezimal, oktal, hexadezimal, binär).
8
08
0x8
0b8

8L
08L
0x8L
0b8L
   
- Variablen vom Typ byte, short, int und long anlegen. Alle möglichen Literale zum Initialisieren dieser Variablen einsetzen☺
byte a = 8;
a = 0b1000;
short b = 8;
b = 0b1000;
int c = 8;
c = 0b1000;
long d = 8L;
d = 0b1000L;

- Kompiliert das Literal 1_000_000?
ja

- Was muss geändert werden, damit folgende Zeile kompiliert:
  int x = 12_345_678_901;
Typ der Variablen und des Literals muss "long" sein.
long d = 12_345_678_901L;
 
- Nennen Sie die möglichen Gleitkommaliterale. Variablen vom Typ float und double mit Gleitkommaliteralen initialisieren - auch in wissenschaftlicher (exponential) Notation.
float f = 12.4f;
double d = 12.4;
d = 12.4E-01;
d = 12.4E+02;
   
- Nennen Sie alle möglichen boolische Literale und initialisieren Sie damit boolesche Variablen.
boolean b = true;
b = false; 
   
- Variablen welcher Typen können mit dem Literal '\uABCD' initialisiert werden?
char a = '\uABCD';

## Konstanten

- Definieren Sie eine lokale Konstante.
void a(){
	final int b = 2;
}
   
- Definieren Sie eine statische Konstante.
final static int b = 2;
   
- Geben Sie die Konstante PI der Klasse java.lang.Math aus.
System.out.println(java.lang.Math.PI);
  
- Soll man eine Konstante explizit initialisieren?

Optional:
- Was ist ein statischer Initialisierungsblock?
   
- Darf man in einem statischen Initialisierungsblock eine statische Konstante initialisieren?

