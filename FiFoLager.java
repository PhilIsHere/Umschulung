package mypackage;
/*
 * +++Pseudocode++
 * Schritt 0: Booleanabfragen isFull und isEmpty erstellen. Z�hlt f�r Gesamtlager
 * Schritt 1: Lagergr��e (Array) festlegen. Default: 15
 * Schritt 1.1: Array zum z�hlen anlegen, sync mit Lagergr��e
 * Schritt 2: Wenn Lagergr��e[x] ungleich NULL --> Counter[x] f�ngt an zu z�hlen
 * Schritt 3: Werte nach alter sortieren --> H�herer Counter = �lterer Wert. �ltere Werte nach vorne
 * Schritt 3.1: Ggf. hilfsarray zum sortieren?
 * Schritt 4: User fragen ob ein String eingef�gt werden soll
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
		System.out.println("Soll ein neues Wort hinzugef�gt werden? y/n");
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
