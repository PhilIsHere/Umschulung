package sortieren;

public class StarteSortieren {

	public static void main(String[] args) {

		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = 10 - i;
		}
		System.out.println("Input:\n");
		BubbleSort.drucke(array);

		BubbleSort.sortiereBubble(array);

	}

}
