# java-114014
java-114014

## Tips & Tricks
### Oracle's Prüfung 
basiert darauf, dass der Prüflung den Compiler spielt, und sonst vom Compiler gefundene Fehler selber findet...


### Static
Wenn man aus der static-Methode "main" andere Methoden der Klasse ohne Erzeugung einer Instanz der Klasse aufruft, müssen diese AUCH static sein.

### Character
Einzelne Zeichen werden in Java durch den Datentyp char dargestellt. Er repräsentiert ein Unicode-Zeichen mit der Länge 16 bit. Wird einer Variable vom Typ char eine Konstante (auch Literal genannt) zugewiesen, muss diese in einfachen Anführungszeichen stehen.

Bei klassischem K&R C: char = 1 Byte;

### Zuweisungen
Zwar finden sich Zuweisungen oft als Ausdrucksanweisung wieder, doch k�nnen sie an jeder Stelle stehen, an der ein Ausdruck erlaubt ist, etwa in einem Methodenaufruf wie print()

Zuweisungen der Form a = b = c = 0; sind erlaubt und gleichbedeutend mit den drei Anweisungen c = 0; b = c; a = b;. 

### Verbundoperator
Besondere Obacht sollten wir auf die automatische Klammerung geben. Bei einem Ausdruck wie a *= 3 + 5 gilt a = a * (3 + 5) und nicht selbstverst�ndlich die Punkt-vor-Strich-Regelung a = a * 3 + 5. 

### Nicht-Kurzschluss-Operatoren
In einigen F�llen ist es erwünscht, dass die Laufzeitumgebung alle Teilausdrücke auswertet. Das kann der Fall sein, wenn Methoden Nebenwirkungen haben sollen, etwa Zustände  ändern. Daher bietet Java zusätzlich die nicht  über einen Kurzschluss arbeitenden Operatoren | und & an, die eine Auswertung aller Teilausdrücke erzwingen. 

System.out.println( true || f() );  // true, f() wird nicht aufgerufen

System.out.println( true | f() );   // true, f() wird aufgerufen

System.out.println( false && f() ); // false, f() wird nicht aufgerufen

System.out.println( false & f() );  // false, f() wird aufgerufen

### Der Rang der Operatoren in der Auswertungsreihenfolge
Tabelle 2.11: Operatoren mit Rangordnung in Java

Druckfehler:
*=, /=, %=, +=, ?=, <<=, >>=, >>>=, &=, ^=, |= 	14 	jeder 	Zuweisung mit Operation 
---------------- ?= m�sste -= heissen

### Sichtbarkeiten
public = sichtbar in allen Packages
protected = sichtbar im selben Package und abgeleiteten Klassen ( auch in anderen Paketen )
(default / package privatge ) = sichbar im selben Package
private = sichtbar nur in der Klasse ( in der das private-Element definiert wurde )

### Import
import = importiert Topleveltypen aus einem Package
import static = importiert statische Elemente aus einer Klasse ( aus einem Topleveltyp ). Es gibt kein Paket mit dem Namen!

### File I/O
import java.io.File = traditionelle File I/O API
import import java.nio.file.* = neue Java7 I/O API mit FileSystem und Path :-)

Welche Methode gibt es in den Klassen "BufferedReader", "BufferedWriter", die es nicht in "Filereader", "FileWriter" gibt? Antwort: readLine(), newLine().

### Collections
Eine gute Klassen-Übersicht über die "Collections" Unterklassen ist im SCJP-Buch auf Seite 558 zu finden.

### Inner Classes
Eine Innere Klasse muss/kann eine beliebige Klasse oder Interface erweitern ( class A extends B {}; class A implements I {};

### Binary Compliment
 Das binäre Komplement von 127 ist -128, das von 1 ist -2.
 x = 127;
 x=~x;
 System.out.println(x)
 -128 

## Klausurvorbereitung ##
- primitive Datentypen (auch Zuweisungen damit)
- Vergleichsoperatoren, aritmetische Operatoren, logische Operatoren
- Kontrollstrukturen (Keywords, auch break und continue)
- einfache Arrays
- Objekte, Referenzen, Klassen, lokale Variable, Attribute unterscheiden
- Sichtbarkeiten
- Klasse String (Methoden)
- Vererbung
- Interface Comparable
- Wrapperklassen (Autoboxing, Konstantenpool)
- Casting von Referenztypen
- innere statische und nichtstatische Klassen
- Reader/Writer richtig öffnen/schliessen ## Nachholbedarf ##
- Regeln fürs Serialisieren ## Nachholbedarf ##
- Collections (Vererbungshierarchie)
- Zuweisungen der generischen Variablen
	
- weitere Schwachpunkte: format, Date+Locale, comparable vs. Comparator

## Kathy Sierra: SCJP
### S.3 Inheritance
Inheritance = Vererbung

### S.17 Abstract Class
Notice that the methods marked abstract end in a semicolon rather than curly braces.

Look for questions with a method declaration that ends with a semicolon, rather
than curly braces. If the method is in a class—as opposed to an interface—then both
the method and the class must be marked abstract.

### S.20 Interfaces
- All interface methods are implicitly `public` and `abstract`. In other words, you do not need to actually type the public or abstract modifiers in the method declaration, but the method is still always public and abstract.
- All variables defined in an interface must be `public`, `static`, and `final`— in other words, interfaces can declare only constants, not instance variables.
- Because interface methods are abstract, they cannot be marked final, strictfp, or native. (More on these modifiers later.)

## OCPJP6_2014
### Zeilennumerierung
- Zeilennumerierung beginnend mit 1 => Vollständige Java-Datei, import-Angaben müssen stimmen
- Keine Zeilennumerierung, oder Zeilennumerierung startet mit Zeile>1 => unvollständiger Code, eventuell zusätzliche Import-Angaben irrelevant für Fragestellung

### Konstruktoren, super
- Konstruktoren werden nicht vererbt.
- Wenn es existiert, wird ein explizites super() mit eventuellen Parametern statt super() ohne Parameter aufgerufen

### Cohesion
- High cohesion is when you have a class that does a well defined job. 
- Low cohesion is when a class does a lot of jobs that don't have much in common.

### Coupling
- Tight coupling is when a group of classes are highly dependent on one another. 
- Loose coupling is achieved by means of a design that promotes single-responsibility and separation of concerns.C

### NumberFormat, Date ( VCE2014, Exam C, Q23 + Q24 )
- NumberFormat nf  = nf.format (input )
- String ds = "December 15, 2004"; DateFormat df = df.parese ( ds );

### NumberFormat, Date ( VCE2014, Exam C, Q177 )
- Date d = new Date(0);
- String ds = "December 15, 2004";
- DateFormat df = DateFormat.getDateInstance();
- d = df.parse(ds)
- d.setTime( (1000 \* 60 \* 60 \* 24) + d.getTime());

### StringBuilder, String ( VCE2014, Exam C, Q28 )
22. - StringBuilder sb1 = new StringBuilder("123");sb1.append("abc");
23. - String s1 = "123"; s1 = s1.concat("abc");

### try-catch-finally ( VCE2014, Exam C, Q35 )
- Finally wird immer durchlaufen, egal ob es eine Exception gab, oder gar eine zweite Exception in einem Catch-Block

### Assertions ##
- VM-Parameter "-enableassertions" muss in den Eclipse-Projekt-Settings für die Java-Datei angegeben werden

### hashCode ##
java.util.HashSet
VCE2014, Exam C, Q40, Q41, siehe Dozent - Collections/src/whl.hascolls
VCE2014, Exam C, Q40: Methode "equals" wird überladen ( "overloaded" ), nicht überschrieben ( "override" ). 

### super ##
- Statische Methoden nehmen nicht am Polymorphismus teil => "Cannot use super in a static context" :-(

### JavaBean Listener Naming Rules ##
- public void add<ListenerType>(<ListenerType> listener),
- public void remove<ListenerType>(<ListenerType> listener)

### Innere Klassen ansprechen ( VCE2014, ExamC, Q91 ) ##
- Line.Point p = new Line.Point(); //statische Klasse Point()
- Line.Point2 p1 = l.new Point2(); //dynamische Klasse Point2()
- Line.Point2 p2 = new Line().new Point2(); //dynamische Klasse Point2()

### AssertionError() ##
- "throw new AssertionError();" => Es wird ein Error geworfen, keine Exception. Error ist Throwable. 
AssertionError() ist nicht durch try/catch abfangbar!

### Date ##

- Date 1/3

Locale loc = Locale.getDefault();
System.out.println(loc.getDisplayCountry()+ " " + df.format(d));

- Date 2/3

DateFormat df;
Date date = new Date();
df = DateFormat.getInstance();

- Date 3/3
<PRE>
public class VCE2014ExcamCQuestion196 {
    public static void main(String[] args) {
        Date date = new Date();
        Locale locale = Locale.ITALY;
        //df.setLocale(locale);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String s = df.format(date);    
        System.out.println(s);
    }
}
</PRE>

### Klassen-Instanzvariablen
Klassen-Instanzvariablen werden Heap gelagert, bei GarbageCollector-Fragen also zu berücksichtigen.

### Konstruktoren aufrufen
Aufruf von Konstruktoren aus anderen Konstruktoren und Methoden nicht möglich, ausser mit 
- "new Klassename()"; 
- "super" ODER "this" in der 1.Zeile
<pre>
public void Hello() {
}
public Hello(int value) {
	//this(); // Alternativer Aufruf von Hello();
    super(); // Alternativer Aufruf von Hello();
}
</pre>

### Synchronisierung
Synchronisisierung und wait() müssen sich auf das selbe Monitor-Objekt beziehen! 

### assert()
- aus Oracle's Sicht: Assert ist nicht angemessen für public Methoden
- aus Oracle's Sicht: Assert ist angemessen für private Methoden
- Ausnahme: switch/default Statement - dort ist Assert auch angemessen

### Properties
- java -Dprop.custom=gobstopper Commander
- Java code, alternativ:
<PRE>
System.getProperty("prop.custom");
System.getProperties().getProperty("prop.custom");
</PRE>

## Exam A
Q 117

### Exam B
Q 1?, Q4? ?

### Exam C
Q 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148?, 149, 150, 151, 152, 153, 154?, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211?, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 
226, 228, 229, 230, 231, 232, 233, 234, 236, 237, 238, 239, 240
