package mypackage;

public class GausischeFormel {

	public static void main(String[] args) {
		int j = 0;

		for (int i = 0; i <= 10; i++) {
			j = j + i;
			System.out.println("i ist nun " + i);
			System.out.println("Summe ist nun " + j);
		}
		System.out.println(j);
	}
}