package mypackage;

import java.util.Scanner;

/*
 * +++Pseudocode+++
 * Schritt 1: User nach Basiswert fragen und in variable speichern HAKEN
 * Schritt 2: User nach Exponent fragen und in variable speichern HAKEN
 * Schritt 2.2: WENN exponent kleiner als Null --> Schritt 2 HAKEN
 * Schritt 3: Wenn Basis & Exponent = 0 dann Ergebnis 1 HAKEN
 * Schritt 4: Wenn Exponent =0 dann Ergebnis 1 HAKEN
 * Schritt 5: Wenn die Basis =0 dann Ergebnis Null HAKEN
 * Schritt 6: Wenn Exponent = 0 dann Finales Ergebnis
 * Schritt 6.1: Wenn Exponent >0 dann Rechnen und exponent--
 * 
*/

public class PowerofX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabebasis;
		int eingabeexponent = 0;
		int eingabeexponenttemp;
		int i;
		int res = 1;

		System.out.println("Welche Zahl ist die Basis? (Ganze Zahl)");
		Scanner scanbasis = new Scanner(System.in);
		eingabebasis = scanbasis.nextInt();
		int eingabebasistemp = eingabebasis;

		System.out.println("Welche Zahl ist der Exponent (Keine negative Zahl!");
		Scanner scanexponent = new Scanner(System.in);
		eingabeexponent = scanexponent.nextInt();
		eingabeexponenttemp = eingabeexponent;

		while (eingabeexponent < 0) {
			System.out.println("ERROR! Die Zahl muss GRÖßER oder GLEICH Null sein!");
			eingabeexponent = scanbasis.nextInt();
			eingabeexponenttemp = eingabeexponent;
		}
		if (eingabebasis == 0 && eingabeexponent == 0 || eingabeexponent == 0) {
			System.out.println("Das Ergebnis lautet: 1");
			System.exit(0);
		}
		while (eingabeexponent > 0) {
			// original --> res = (res + (eingabebasis * eingabeexponent));
			// Probe: 2^4 = 16, 2^8 = 256
			res = res * eingabebasis; // 2^8 == 2*2=4 4*2=8 8*2=16 16*2=32
			eingabeexponent--;
			// System.out.println("DEBUG 1 eingabeexponent entspricht "+eingabeexponent);
		}
		System.out.println("Das Ergebnis lautet " + res);
		System.exit(0);
	}
}