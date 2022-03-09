package Warenkorb;

public class Warenkorb {
	private Artikel artikelImWarenkorb[]					= new Artikel[0];
	private int		artikelAnzahlImWarenkorb[]				= new int[0];
	
	
	//Methoden
	public double getBestellwert() {
		double gesamtbestellwert = 0.0;
		//Laufe durch alle Artikel im Warenkorb
		for (int i = 0; i < this.artikelImWarenkorb.length; i++) {
			//Hole den Artikelpreis von Artikel auf Position i und multipliziere es mit der Anzahl d. Artikels im Warenkorb
			gesamtbestellwert += this.artikelImWarenkorb[i].getArtikelpreis() * this.artikelAnzahlImWarenkorb[i];
		}
		return gesamtbestellwert;
		
	}
	
	public void addArtikel (Artikel artikelbezeichnung, int anzahlArtikelImWarenkorb) {
		int gesamtanzahl = this.artikelAnzahlImWarenkorb.length;
		//Wenn keine Artikel im Warenkorb, dann... Ist nichts drinne...
		if(gesamtanzahl == 0) {
			this.artikelAnzahlImWarenkorb 	= new int[1];
			this.artikelImWarenkorb			= new Artikel[1];
			this.artikelImWarenkorb[0]		= artikelbezeichnung;
			this.artikelAnzahlImWarenkorb[0]= anzahlArtikelImWarenkorb;
		}
		else {
			//Erstelle Arrays für Bezeichnung und Preis
			Artikel temp1[]		= new Artikel[gesamtanzahl + 1];
			int		temp2[]		= new int[gesamtanzahl + 1];
			//Laufe durch alle Artikel
			for (int i = 0; i < gesamtanzahl; i++) {
				temp1[i]	= this.artikelImWarenkorb[i];
				temp2[i]	= this.artikelAnzahlImWarenkorb[i];
			}
			temp1[gesamtanzahl] = artikelbezeichnung;
			temp2[gesamtanzahl] = anzahlArtikelImWarenkorb;
			
			this.artikelImWarenkorb			= temp1;
			this.artikelAnzahlImWarenkorb	= temp2;
			
		}
	}

}
