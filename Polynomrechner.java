package mypackage;

import java.util.Scanner;

public class Polynomrechner {
	public static void main(String[] args) {
		// Takes userinput, creates an Array with the according space+1 and saves the
		// input in "gradangabe"
		System.out.println("Welchen Grad soll dein Polynom entsprechen?");
//		System.out.println("DEBUG VALUE 5 ADDED!");
//		int gradangabe = 5; // Debug Value for Input
		Scanner scanner = new Scanner(System.in);
		int gradangabe = scanner.nextInt();
		if (gradangabe < 0) {
			while (gradangabe < 0) {
				System.out.println("Welchen Grad soll dein Polynom entsprechen?");
				gradangabe = scanner.nextInt();
			}
		}
		int eingabe = gradangabe;
		double[] myArray = new double[gradangabe];
		pop_array(gradangabe, myArray);
		calc_array(gradangabe, myArray);

	}

	// Calculates the Array accordingly and sorts it in descending order
	public static double[] calc_array(int gradangabe, double[] myArray) {
//		System.out.println("VALUE FOR myArray[0] changed to 8!");
//		myArray[0] = 8;
//		System.out.println("VALUE FOR myArray[1] changed to 8!");
//		myArray[1] = 8;
//		System.out.println("VALUE FOR myArray[2] changed to 8!");
//		myArray[2] = 8;
//		System.out.println("VALUE FOR myArray[3] changed to -23!");
//		myArray[3] = -23;
//		System.out.println("VALUE FOR myArray[4] changed to 0!");
//		myArray[4] = 0;
		System.out.print("f(x) = ");
		for (int i = 0; i < myArray.length; i++) {
			if (i == 0 && myArray[(gradangabe - 1)] < 0 && myArray[(gradangabe - 2)] < 0) {
				System.out.print((int) myArray[(gradangabe - 1)] + "x^" + (myArray.length - i));
			} else if ((i == 0 && myArray[(gradangabe - 1)] < 0 && myArray[(gradangabe - 2)] >= 0)) {
				System.out.print((int) myArray[(gradangabe - 1)] + "x^" + (myArray.length - i));
			} else if (i == 0 && myArray[(gradangabe - 1)] >= 0
					&& ((myArray[(gradangabe - 2)] >= 0) || (myArray[(gradangabe - 2)] < 0))) {
				System.out.print((int) myArray[(gradangabe - 1)] + "x^" + (myArray.length - i));
			} else if (i == (gradangabe - 1) && myArray[0] < 0) {
				System.out.println((int) myArray[0]);
			} else if (i == (gradangabe - 1) && myArray[0] >= 0) {
				System.out.println("+" + (int) myArray[0]);
			}

			else if (i >= 1 && i < myArray.length) {
				if (myArray[(myArray.length - 1 - i)] < 0) { // When Negative Number don't print "+"
					System.out.print((int) myArray[(myArray.length - 1 - i)] + "x^" + (myArray.length - i));
				} else if ((int) myArray[(myArray.length - 1 - i)] >= 0) { // if positive number print "+" but only if
																			// next
																			// number is positive as well
					System.out.print("+" + (int) myArray[(myArray.length - 1 - i)] + "x^" + (myArray.length - i));
				}
			}
		}
		return myArray;
	}

	// Populates the Array with random Numbers.
	public static double pop_array(int gradangabe, double myArray[]) {
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (100 * Math.random() - 33);
			System.out.println("Index " + i + " " + myArray[i]);
		}
		return gradangabe;
	}
}