package mypackage;

public class Loops {
	
	public static void main(String[] args) {
		//For schleife, oder Z�HLschleifen
		int limit = 100;
		for(int i = 0; i <= limit; i=i+2) {
		System.out.println(i);
		}
		
		//Kopfschleife = Mache etwas solange etwas nicht erf�llt ist.
		int j = 0;
		while(j<=100) {
			if (j < 0) {
				System.out.println("Schleifeneintrittsbedingung nicht erf�llt");
			}
			System.out.println("While oder for.");
			j++;
		}
	}
}