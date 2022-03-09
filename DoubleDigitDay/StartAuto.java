package DoubleDigitDay;

public class StartAuto {

	public static void main(String[] args) {
		Auto schnuffi = new Auto("BMW", "316i", 300, 20, "Grün-Metallic");
		System.out.println("Schnuffi:\nHersteller: " +schnuffi.getHersteller()+"\n" +"Modell: " +schnuffi.getModell()+"\n"+"Farbe: "+schnuffi.getFarbe());
		Auto porsche = new Auto("Porsche", "911 Carrera", 3000, 20, "Schwarz");
		System.out.println("\nPorsche:\nHersteller: " +porsche.getHersteller()+"\n" +"Modell: " +porsche.getModell()+"\n"+"Farbe: "+porsche.getFarbe());
		
		
		schnuffi.beschleunige(10);
		schnuffi.bremse(-5);
	}

}
