package mypackage;

public class Test {
	
	public static void main(String [] args) {
		System.out.println("Eine IDE super!");
		
		//byte ist 1 Byte groß
		byte value = 117;
		
		//short ist 2 Byte groß
		short value2 = 315;
		
		//int ist 4 bytes groß
		int value3 = 327699;
		
		//Werte uwandeln
		byte store = ( byte)value2;
		
		//Kommazahlen immer als Float oder Double. Float reicht für 32 Bit große Zahlen. Double ist für 64 bit Zahlen
		float f = 2.5f;
		double d = 2.567f;
		
		//Char für Buchstaben
		char lat = 78;
		
		//Ringtausch Problematik
		int zahl1 = 100;
		int zahl2 = 50;
		
		/* MERKSATZ OSI Modell
		 * Please do Not throw Salami Pizza away
		 * Physical Data Link Network Transport Session Physical Application
		 * 
		 * Alle Deutschen Studenten trinken verschiedene Sorten Bier
		 * Anwendung Darstellung Sitzung Transport Vermittlung Sicherungsschicht Bitübertragung
		 */
		
		System.out.println("Der Wert von value beträgt " +value);
		System.out.println("Der Wert von value2 beträgt " +value2);
		System.out.println("Der Wert von value2 beträgt " +value3);
		System.out.println("Der Wert von store beträgt " +store);
		System.out.println("Der Wert von ltr beträgt " +lat);
	}

}
