package mypackage;

/*
 * Die Aufgabe ist es zahl1 = 100 mit zahl2 = 50 zu tauschen.
 */

public class Ringtausch {
	public static void main(String[] args) {
	//Aufgabe
	int zahl1 = 100;
	int zahl2 = 50;
	
	//Lösung = Hilfsvariable nutzen. zahl3 fungiert hierbei als Zwischenspeicher um den Wert nicht zu verlieren
	int zahl3 = zahl1;
	zahl3 = zahl2;
	
	System.out.println("zahl 1 ist gleich " +zahl3);
	System.out.println("zahl 2 ist gleich " +zahl1);
	System.out.println("zahl 3 ist gleich " +zahl3);

	}
} 