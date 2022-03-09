package Verschluesselung;

public interface Chiffre {
	//Erhalten nur abstrakte Methoden, ohne diese <<abstract>> zu nennen
	//Ein Interface kann keinen Code erhalten!
	
	public String verschluesseln(String klartext);
	public String entschluesseln(String geheim);
}
