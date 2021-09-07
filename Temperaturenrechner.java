package mypackage;

import java.util.Scanner;

public class Temperaturenrechner {

	public static void main(String[] args) {
		System.out.println(
				"Willkommen zum Temperaturenumrechner. Ist deine vorliegende Zahl in Celsius oder Fahrenheit?");
		Scanner scan = new Scanner(System.in);
		char temptype = scan.next().charAt(0);
		System.out.println("Du hast " + temptype + " gewählt. Gib nun den Wert der Temparatur an.");
		double tempval = scan.nextDouble();
		if (temptype == 'C' || temptype == 'c') {
			celsius(tempval);
		} else if (temptype == 'F' || temptype == 'f') {
			fahrenheit(tempval);
		}
	}

	// Output Funktion
	public static void showOutput(double res) {
		System.out.println("Das Ergebnis beträgt " + res);
	}

	// Input in Grad Celsius
	public static double celsius(double tempval) {
		double BRUCHCEL = 1.8;
		double farcel = (double) (tempval * BRUCHCEL + 32);
		int farcelround = (int) farcel;
		if (farcel < 0) {
			for (int i = 1; farcel < farcelround; i++) {
				farcel += 0.1;
				if (i >= 5) {
					farcelround--;
				}
			}
		} else {
			for (int i = 1; farcel > farcelround; i++) {
				farcel -= 0.1;
				if (i >= 5) {
					farcelround++;
				}
			}

		}
		System.out.println("" + tempval + " Grad Fahrenheit entsprechen " + farcelround + " in Grad Celsius");
		return farcelround;
	}

	// Input in Grad Fahrenheit
	public static int fahrenheit(double tempval) {
		double BRUCHFAR = 1.8;
		double farres = (double) (tempval - 32) / BRUCHFAR;
		int farresround = (int) farres;
		if (farres < 0) {
			for (int i = 1; farres < farresround; i++) {
				farres += 0.1;
				if (i >= 5) {
					farresround--;
				}
			}
		} else {
			for (int i = 1; farres > farresround; i++) {
				farres -= 0.1;
				if (i >= 5) {
					farresround++;
				}
			}

		}
		System.out.println("" + tempval + " Grad Fahrenheit entsprechen " + farresround + " in Grad Celsius");
		return farresround;
	}
}