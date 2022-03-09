package dateihandling;

import java.io.File;
import java.io.IOException;

public class TestDateien {

	public static void main(String[] args) {
		String dateiname = System.getenv("USERPROFILE")+"\\eclipse-workspace\\meinedatei";
		File neueDatei = new File (System.getenv("USERPROFILE")+"\\eclipse-workspace\\neuedatei");
		File meinedatei = new File(dateiname);
		
		System.out.println(meinedatei.exists());
		
		if (meinedatei.exists()){
			System.out.println(meinedatei.isDirectory()+" " + meinedatei.getName() +" -> ist ein Verzeichnis");
			System.out.println(meinedatei.isFile()+" " + meinedatei.getName() +" -> ist eine Datei");
			System.out.println(meinedatei.getAbsolutePath());
		}
		
		try {
			neueDatei.createNewFile(); //Erzeugt eine Datei im Dateisystem. Nutzt Angaben aus globaler Variable.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
