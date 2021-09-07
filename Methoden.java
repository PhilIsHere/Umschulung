package mypackage;
/*
 * Methoden haben den Vorteil, dass die MAIN entlastet werden.
 * Die Main ruft im Grunde genommen nur die Methoden auf.
 * Sie dienen der Übersichtlichkeit da der Code nicht hintereinander einfach aufgelistet wird, sondern dieser in "Kategorien" eingeordnet ist.
 * In der Main wird die Methode aufgerufen. In den Methoden selber wird diese Deklariert.
 */

public class Methoden {
	public static void showOutput(long res) {
		System.out.println("Das Ergebnis beträgt "+res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long eingabe = -1;
		long res = getFaculty(eingabe); //innerhalb der Klammer können Variablen genutzt werden.
		showOutput(res);
		
		
	}

	// Methoden erstellen. LONG ist der Rückgabewert.
	public static long getFaculty(long eingabe) {
		long res = 0;
		long eingabetmp = eingabe;
		
		
		if(eingabe <= 0) {
			System.out.println("Der Eingabewert muss höher als Null sein!");
			for (int i=0; i <=3; i++) {
				System.out.println(("Versuch "+i) +(" von 3! Die Zahl muss höher als Null sein!"));
			}
			System.out.println("3 mal Fehlgeschlagen! Das Programm wird beendet!");
			return -2;
		}
		for(int i=0; i <= eingabetmp; i++) {
			res = res + eingabe;
			eingabe--;
			//System.out.println("DEBUG 1 res ist "+res);
		}
		//System.out.println("Der Wert von res ist "+res);
		return res;
	}
	
}

