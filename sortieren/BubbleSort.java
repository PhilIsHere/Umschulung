package sortieren;

public class BubbleSort {

	public static int[] sortiereBubble(int bubble[]) {

		// Tempor�rer speicher f�r den Array-Slot
		int temp;
		boolean fertig = false;

		while (!fertig) {
			// fertig ist true damit die while schleife verlassen wird falls die For und if
			// Schleifen nichts mehr zu tun haben.
			fertig = true;
			// bubble.lengh -1, da sonst out of bound und dann gibt's einen error.
			for (int i = 0; i < bubble.length - 1; i++) {
				// Pr�fe ob der aktuelle Slot gr��er ist als der danach
				if (bubble[i] > bubble[i + 1]) {
					// Speichere den Aktuellen wert, damit er nicht verloren geht
					temp = bubble[i];
					// F�ge den Wert des n�chsten Slots in den aktuellen
					bubble[i] = bubble[i + 1];
					// F�lle den n�chsten Slot aus temp ein.
					bubble[i + 1] = temp;
					// drucke(bubble); //DEBUG OPTION
					// While schleife auf false, damit nochmal durchlaufen wird,
					fertig = false;

				}

			}

		}
		System.out.println("\n\nDas Ergebnis:");
		drucke(bubble);
		return bubble;

	}

	public static void drucke(int bubble[]) {
		for (int i = 0; i < bubble.length; i++) {
			System.out.print(bubble[i] + "\t");
		}
		System.out.println();
	}

}
