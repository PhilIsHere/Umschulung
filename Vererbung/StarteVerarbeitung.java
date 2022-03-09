package Vererbung;

public class StarteVerarbeitung extends Mitarbeitender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mitarbeitender eins = new Mitarbeitender();
		Arbeiter zwei = new Arbeiter();
		
		eins.name = "Meister Yoda";
		System.out.println(eins.name);
		
		Praktikant vier = new Praktikant();
		vier.kocheKaffee();
		vier.arbeite();
		
		Mitarbeitender fuenf = new Praktikant();
		fuenf.arbeite();

	}

}
