package dateihandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Uebungsaufgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte gib den Pfad der Datei ein: ");
		//String PATH = scanner.next();
		String PATH = System.getenv("USERPROFILE")+"\\eclipse-workspace";
		System.out.print("Bitte gib den Dateinamen ein: ");
		//String FILENAME = scanner.next();
		String FILENAME = "10lines";
		System.err.println("DEBUG MODUS AKTIV! STANDARDPFAD UND DATEINAME GEWÄHLT!");
		File datei = new File(PATH+"\\" + FILENAME);
		
		if (datei.exists() && datei.isFile()) {
			FileWriter	file 	= null;
			BufferedWriter buf 	= null;
			boolean anhang 		= true;
			
			try {
				file = new FileWriter(datei, anhang);
				buf = new BufferedWriter(file);
				for (int i = 0; i <10; i++) {
					System.out.println("Bitte gib deinen "+(i+1)+".ten Satz ein: ");
					buf.write(scanner.next()+"\n");
				}
				buf.flush();
				buf.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}else {
			try {
				datei.createNewFile();
				System.err.println("Die Datei wurde erstellt und ist leer. Bitte das Programm erneut Starten um die Sätze einzugeben.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
