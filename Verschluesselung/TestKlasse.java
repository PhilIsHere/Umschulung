package Verschluesselung;

import java.util.Scanner;

public class TestKlasse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Chiffre eins = new CaesarChiffre(2);
		System.out.println("Ich habe ein Chiffre Objekt erzeugt!");
		
		String text;
		System.out.println("Bitte Text eingeben: ");
		//text = scanner.nextLine();
		System.err.println("DEBUGMODUS AKTIVIERT, STANDARDWERTE GELADEN");
		text = "Testnachricht";
		
		System.out.println("Text: "+text);
		System.out.println("Verschlüsselt: "+eins.verschluesseln(text));
		
		String geheimbotschaft = eins.entschluesseln(eins.verschluesseln(text));
		
		System.out.println("Entschlüsselt: "+geheimbotschaft);
				
	}

}
