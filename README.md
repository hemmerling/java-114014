# java-114014
java-114014

## Oracle's Pr�fung basiert darauf,
dass der Pr�flung den Compiler spielt, und sonst vom Compiler gefundene Fehler selber findet...

## Zuweisungen
Zwar finden sich Zuweisungen oft als Ausdrucksanweisung wieder, doch k�nnen sie an jeder Stelle stehen, an der ein Ausdruck erlaubt ist, etwa in einem Methodenaufruf wie print()

Zuweisungen der Form a = b = c = 0; sind erlaubt und gleichbedeutend mit den drei Anweisungen c = 0; b = c; a = b;. 

## Verbundoperator
Besondere Obacht sollten wir auf die automatische Klammerung geben. Bei einem Ausdruck wie a *= 3 + 5 gilt a = a * (3 + 5) und nicht selbstverst�ndlich die Punkt-vor-Strich-Regelung a = a * 3 + 5. 

## Nicht-Kurzschluss-Operatoren
In einigen F�llen ist es erw�nscht, dass die Laufzeitumgebung alle Teilausdr�cke auswertet. Das kann der Fall sein, wenn Methoden Nebenwirkungen haben sollen, etwa Zust�nde �ndern. Daher bietet Java zus�tzlich die nicht �ber einen Kurzschluss arbeitenden Operatoren | und & an, die eine Auswertung aller Teilausdr�cke erzwingen. 

System.out.println( true || f() );  // true, f() wird nicht aufgerufen

System.out.println( true | f() );   // true, f() wird aufgerufen

System.out.println( false && f() ); // false, f() wird nicht aufgerufen

System.out.println( false & f() );  // false, f() wird aufgerufen
