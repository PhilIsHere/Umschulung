package DoubleDigitDay;

public class Auto {
	private String hersteller;
	private String modell;
	private int pferdestaerke;
	private int geschwindigkeit;
	private String farbe;

	public Auto() {

	}

	public Auto(String hersteller, String modell, int pferdestaerke, int geschwindigkeit, String farbe) {
		this.hersteller = hersteller;
		this.modell = modell;
		this.pferdestaerke = pferdestaerke;
		this.geschwindigkeit = geschwindigkeit;
		this.farbe = farbe;
	}

	// Methoden
	public void fahre() {

	}

	public void starteMotor() {

	}

	public void motorAusschalten() {

	}

	public void beschleunige(int kmh) {
		if (kmh < 0) {
			System.err.println(
					"Die eingegebene Zahl ist unter Null! Das Auto soll beschleunigt, nicht abgebremst werden.");
			for (int i = 0; i < 3; i++) {
				System.err.println("Bitte gib eine gültige Zahl an (größer als 0).Versuch " + (i + 1) + " von 3!");
			}

		} else if (kmh == 0) {
			System.out.println("Das Auto fährt weiterhin mit " + this.geschwindigkeit + " Km/h");
		} else if (kmh > 0) {
			this.geschwindigkeit += kmh;
			System.out.println("Das Auto fährt jetzt mit " + this.geschwindigkeit + " Km/h");
		}
	}

	public void bremse(int kmh) {
		if (kmh > 0) {
			System.err.println(
					"Die eingegebene Zahl ist größer als Null! Das Auto soll abgebremst, nicht beschleunigt werden.");
			for (int i = 0; i < 3; i++) {
				System.err.println("Bitte gib eine gültige Zahl an (größer als 0).Versuch " + (i + 1) + " von 3!");
			}

		} else if (kmh == 0) {
			System.out.println("Das Auto fährt weiterhin mit " + this.geschwindigkeit + " Km/h");
		} else if (kmh < 0) {
			this.geschwindigkeit += kmh;
			System.out.println("Das Auto fährt jetzt mit " + this.geschwindigkeit + " Km/h");
		}

	}

	// getter und setter
	public String getHersteller() {
		return hersteller;
	}

	public String getModell() {
		return modell;
	}

	public int getPferdestaerke() {
		return pferdestaerke;
	}

	public String getFarbe() {
		return farbe;
	}

}
