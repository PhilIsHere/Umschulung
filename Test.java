package mypackage;

public class Test {
	
	public static void main(String [] args) {
		System.out.println("Eine IDE super!");
		
		//byte ist 1 Byte gro�
		byte value = 117;
		
		//short ist 2 Byte gro�
		short value2 = 315;
		
		//int ist 4 bytes gro�
		int value3 = 327699;
		
		//Werte uwandeln
		byte store = ( byte)value2;
		
		//Kommazahlen immer als Float oder Double. Float reicht f�r 32 Bit gro�e Zahlen. Double ist f�r 64 bit Zahlen
		float f = 2.5f;
		double d = 2.567f;
		
		//Char f�r Buchstaben
		char lat = 78;
		
		//Ringtausch Problematik
		int zahl1 = 100;
		int zahl2 = 50;
		
		/* MERKSATZ OSI Modell
		 * Please do Not throw Salami Pizza away
		 * Physical Data Link Network Transport Session Physical Application
		 * 
		 * Alle Deutschen Studenten trinken verschiedene Sorten Bier
		 * Anwendung Darstellung Sitzung Transport Vermittlung Sicherungsschicht Bit�bertragung
		 */
		
		System.out.println("Der Wert von value betr�gt " +value);
		System.out.println("Der Wert von value2 betr�gt " +value2);
		System.out.println("Der Wert von value2 betr�gt " +value3);
		System.out.println("Der Wert von store betr�gt " +store);
		System.out.println("Der Wert von ltr betr�gt " +lat);
	}

}
