package mypackage;
/*
 * +++Pseudocode++
 * Schritt 0: Booleanabfragen isFull und isEmpty erstellen. Zählt für Gesamtlager
 * Schritt 1: Lagergröße (Array) festlegen. Default: 15
 * Schritt 1.1: Array zum zählen anlegen, sync mit Lagergröße
 * Schritt 2: Wenn Lagergröße[x] ungleich NULL --> Counter[x] fängt an zu zählen
 * Schritt 3: Werte nach alter sortieren --> Höherer Counter = Älterer Wert. Ältere Werte nach vorne
 * Schritt 3.1: Ggf. hilfsarray zum sortieren?
 * Schritt 4: User fragen ob ein String eingefügt werden soll
 * Schritt 5: Wenn ja: Abfrage und String ins Lager
 */

import java.lang.*;
import java.util.*;

public class FiFoLager {
	public static void main(String[] args) {
		String[] lager = createarray();
		createcounter((int )lager.length);
		userinput(lager);

	}

	public static void userinput(String[] lager) {
		System.out.println("Soll ein neues Wort hinzugefügt werden? y/n");
		Scanner scanner = new Scanner(System.in);
		char yesno = scanner.next().charAt(0);
		
	}

	public static int[] createcounter(int length) {
		int[] lagercount = new int[length];
		return lagercount;
		
	}

	public static String[] createarray() {
		String[] lager = new String[15];
		return lager;

		
	}

}
