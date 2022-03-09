package Warenkorb;

public class Ausführung {

	public static void main(String[] args) {
		
		Artikel eins = new Artikel("Poster", 9.99);
		System.out.println(eins.getArtikelbezeichnung());
		System.out.println(eins.getArtikelpreis());
		
		Warenkorb waren = new Warenkorb();
		waren.addArtikel(eins, 5);
		System.out.println(waren.getBestellwert());

	}

}
