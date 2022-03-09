package dateihandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DateiSchreiben {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String path = System.getenv("USERPROFILE")+"\\eclipse-workspace\\";
		System.out.println("Bitte gib einen Dateinamen ein: ");
		String dateiname = scanner.next();
		File datei = new File(path + dateiname);
		FileWriter file = null;
		
		
		if (datei.exists() && datei.isFile()) {
			System.out.println("Datei existiert bereits! Gut so ...");
		}
		try {
			file = new FileWriter(datei);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter buf = new BufferedWriter(file);
		for (int i = 0; i < 99; i++) {
			try {
				buf.write("Dies ist die " + i + ".te Zeile!\n");
				buf.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			buf.close();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
