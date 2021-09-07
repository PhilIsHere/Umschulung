package mypackage;

public class PowerofXMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long eingabebasis = 2;
		long eingabeexponent = 4;
		long res_expo = 1;
		getExponent(eingabebasis, eingabeexponent, res_expo);
	}

	public static long getExponent(long eingabebasis, long eingabeexponent, long res_expo) {
		if (eingabeexponent < 0) {
			System.out.println("ERROR! Die Zahl muss GRÖßER oder GLEICH Null sein!");
		}
		else if (eingabebasis == 0 && eingabeexponent == 0 || eingabeexponent == 0) {
			System.out.println("Das Ergebnis lautet: 1");
			return 1;
		}
		while (eingabeexponent > 0) {
			// Probe: 2^4 = 16, 2^8 = 256
			res_expo = res_expo * eingabebasis; // 2^8 == 2*2=4 4*2=8 8*2=16 16*2=32
			eingabeexponent--;
		}
		System.out.println("Das Ergebnis lautet " + res_expo);
		return res_expo;
	}
}