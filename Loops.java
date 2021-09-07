package mypackage;

public class Loops {
	
	public static void main(String[] args) {
		//For schleife, oder ZÄHLschleifen
		int limit = 100;
		for(int i = 0; i <= limit; i=i+2) {
		System.out.println(i);
		}
		
		//Kopfschleife = Mache etwas solange etwas nicht erfüllt ist.
		int j = 0;
		while(j<=100) {
			if (j < 0) {
				System.out.println("Schleifeneintrittsbedingung nicht erfüllt");
			}
			System.out.println("While oder for.");
			j++;
		}
	}
}