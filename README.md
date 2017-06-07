# java-114014
java-114014

## 2017-04-11
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

