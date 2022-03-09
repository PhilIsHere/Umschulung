package Warenkorb;

public class Artikel {
	
	private String artikelbezeichnung;
	private double artikelpreis;
	
	public Artikel(){	}
	
	public Artikel(String artikelbezeichnung, double artikelpreis) {
		this.artikelbezeichnung			= artikelbezeichnung;
		this.artikelpreis				= artikelpreis;
	}
	
	//Methoden
	
	
	//Getter und Setter
	public double getArtikelpreis() {
		return artikelpreis;
	}

	public void setArtikelpreis(double artikelpreis) {
		this.artikelpreis = artikelpreis;
	}

	public String getArtikelbezeichnung() {
		return artikelbezeichnung;
	}

}
