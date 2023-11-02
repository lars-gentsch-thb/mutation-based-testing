# Mutation Testing am Beispiel von PITest und einem Palindrom

### Ausführung von PITest

Das PITest-Maven-Plugin in kann mit folgendem Befehl ausgeführt werden:

```
$ mvn test-compile org.pitest:pitest-maven:mutationCoverage
```

Die erzeugten Reports befinden sich im Verzeichnis `target/pit-reports`.

## Definition

Für diese Aufgabe ist ein Palindrom definiert
als Zeichenkette, die aus druckbaren Zeichen
besteht, die sowohl von rechts nach links
als auch von links nach rechts gelesen werden kann
und das selbe Wort ergibt.

### Beispiele für gültige Palindrome

* "anna"
* "otto"
* "ehe"
* "Retsinakanister"
* ">!<"

### Beispiele für ungültige Palindrome

* "!!>"
* " anna"
