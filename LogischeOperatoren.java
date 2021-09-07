package mypackage;

public class LogischeOperatoren {
	
	public static void main(String [] args) {
		byte a = 68;
		byte b = -14;
		byte c = (byte )(a&b);
		System.out.println("Der Wert von c ist gleich "+c);
		
		
		//Shifting Operator sind dann sinnvoll, wenn man um Bytewerte multiplizieren/dividieren möchte
		int num1 = 68;
		
		//Byteverschiebung MIT ZWEI Pfeilen um 1 nach links zum multiplizieren und VORZEICHEN ZU BERÜCKSICHTIGEN. Ergibt num1 * 2, da ich den Byte nach links verschiebe.
		int resmulti = num1<<1;
		
		//Byteverschiebung MIT ZWEI Pfeilen um 2 nach rechts zum dividieren und VORZEICHEN ZU BERÜCKSICHTIGEN. Ergibt num1 / 4, da ich den Byte nach rechts verschiebe.
		int resdivi = num1>>2;		
		
		System.out.println("Der Wert von num1 ist gleich "+num1);
		System.out.println("Der Wert von resmulti ist gleich "+resmulti);
		System.out.println("Der Wert von resdivi ist gleich "+resdivi);
	}

}
