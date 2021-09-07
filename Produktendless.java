package mypackage;

import java.util.Scanner;
/*
 * +++Pseudocode+++
 * Schritt 1: User muss nach einer Zahl größer oder gleich Null gefragt werden bis seine Eingabe gültig ist
 * Schritt 1.1: Wenn Eingabe = 0 dann 1 printen und Programm beenden. Ansonsten bei Schritt 2 weiter.
 * Schritt 2: Eingabe muss in einer Variable gespeichert werden
 * Schritt 2.1: Eingabe muss außerdem in eine Hilfsvariable gespeichert werden
 * Schritt 3: Schleife in der die Eingabe berücksichtigt und verarbeitet wird
 */

public class Produktendless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabe;
		int res = 1;

		System.out.println("Welche Zahl soll Multipliziert werden? (>=0)");
		Scanner scan = new Scanner(System.in);
		eingabe = scan.nextInt();
		int eingabetemp = eingabe;

		if (eingabe == 0) {
			System.out.println("Das Ergebnis ist 1");
			// System.exit(0);
		}
		while (eingabe < 0) {
			System.out.println("ERROR! Die Zahl muss GRÖßER oder GLEICH Null sein!");
			eingabe = scan.nextInt();
			eingabetemp = eingabe;
		}
		for (int i = 0; eingabe > 0; i++) {
			res = eingabe * res;
			eingabe--;
			// System.out.println("DEBUG 1 res ist " + res);
		}
		System.out.println("Der Wert von res ist " + res);
	}

}
