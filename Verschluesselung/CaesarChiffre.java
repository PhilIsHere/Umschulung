package Verschluesselung;

public class CaesarChiffre implements Chiffre {
	
	private int key;
	public CaesarChiffre(int key) {
		super();
		this.key = key;
	}

	@Override
	public String verschluesseln(String klartext) {
		char current;
		klartext = klartext.toUpperCase();
		StringBuilder geheim = new StringBuilder();
		
		for (int i=0; i < klartext.length(); i++) {
			current = klartext.charAt(i);
			if (current >= 'A' && current <='Z') {
				current += this.key;
				if (current > 'Z') {
					current -= 26;
				}
				
			}
			geheim.append(current);
			
		}
		return geheim.toString();
	}

	public String entschluesseln(String geheim) {
		char current;
		System.out.println("Entschlüsselt wird: "+geheim+" mit dem Key: "+key);
		StringBuilder entschluesselt = new StringBuilder();
		
		for (int i = 0; i< geheim.length(); i++) {
			current = geheim.charAt(i);
			if(current <='Z' && current >= 'A') {
				current -= this.key;
				if (current < 'A') {
					current += 26;
				}
			}
			entschluesselt.append(current);
		}
		
		return entschluesselt.toString();
	}

}
