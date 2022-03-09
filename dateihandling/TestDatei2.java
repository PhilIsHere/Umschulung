package dateihandling;

import java.io.*;
import java.util.Scanner;

public class TestDatei2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path = System.getenv("USERPROFILE")+"\\eclipse-workspace\\";
		String dateiname = scanner.next("Bitte gebe einen Dateinamen ein: ");
		File datei = new File(path + dateiname);

		if (datei.exists()) {
			System.err.println("Der Dateiname existiert bereits!");
		} else {
			System.out.println("Die Datei existiert noch nicht.");
			try {
				datei.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}