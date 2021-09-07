package mypackage;

import java.util.Scanner;

public class Produktdreimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabe;
		int res = 1;
		int i;

		System.out.println("Welche Zahl soll Multipliziert werden? (>=0)");
		Scanner scan = new Scanner(System.in);
		eingabe = scan.nextInt();
		int eingabetemp = eingabe;

		if (eingabe == 0) {
			System.out.println("Das Ergebnis ist 1");
			// System.exit(0);
		}
		if (eingabe < 0) {
			for (i = 0; i <= 1; i++) {
				System.out.println(
						("ERROR! Die Zahl muss GRÖßER oder GLEICH Null sein! Versuch " + (i + 1)) + (" von 3!"));
				eingabe = scan.nextInt();
				eingabetemp = eingabe;
			}
			for (int j = 0; j < eingabetemp; j++) {
				res = eingabe * res;
				eingabe--;
				// System.out.println("DEBUG 1 res ist " + res);
			}
			System.out.println(("ERROR! Versuch " + (i + 1)) + (" von 3! Das Programm wird beendet!"));
			System.exit(0);
		}
		for (int k = 0; k < eingabetemp; k++) {
			res = eingabe * res;
			eingabe--;
			// System.out.println("DEBUG 2 res ist " + res);
		}
		System.out.println("Der Wert von res ist " + res);
	}
}