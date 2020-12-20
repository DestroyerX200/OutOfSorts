import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class Tester {
	public static void testBubbleSort(int sizeOfArray, int numberOfTests) {
		for (int i = 0; i < numberOfTests; i++) {
			Random rng = new Random(i);
			int[] originalArray = new int[sizeOfArray];

			for (int j = 0; j < sizeOfArray; j++) {
				int randomParity = new Random().nextInt() % 2;
				int negativeOrNot = -1;
				if (randomParity == 0) {
					negativeOrNot = 1;
				}
				originalArray[j] = rng.nextInt() % 100000 * negativeOrNot; 
			}

			int[] myArray = Arrays.copyOf(originalArray, originalArray.length);
			Sorts.bubbleSort(myArray);

			int[] expectedArray = Arrays.copyOf(originalArray, originalArray.length);
			Collections.sort(expectedArray);

			System.out.println("Random Original Array: " + Arrays.toString(originalArray));
			System.out.println("Expected Array       : " + Arrays.toString(expectedArray));
			System.out.println("My Array             : " + Arrays.toString(myArray));

			if (Arrays.equals(expectedArray, myArray)) {
				System.out.println("Success!");
				System.out.println();
			} else {
				System.out.println("NOT equivalent!");
				System.out.println();
			}
		}
	}
	public static void testSelectionSort(int sizeOfArray, int numberOfTests) {
		for (int i = 0; i < numberOfTests; i++) {
			Random rng = new Random(i);
			int[] originalArray = new int[sizeOfArray];

			for (int j = 0; j < sizeOfArray; j++) {
				int randomParity = new Random().nextInt() % 2;
				int negativeOrNot = -1;
				if (randomParity == 0) {
					negativeOrNot = 1;
				}
				originalArray[j] = rng.nextInt() % 100000 * negativeOrNot; 
			}

			int[] myArray = Arrays.copyOf(originalArray, originalArray.length);
			Sorts.selectionSort(myArray);

			int[] expectedArray = Arrays.copyOf(originalArray, originalArray.length);
			Collections.sort(expectedArray);

			// System.out.println("Random Original Array: " + Arrays.toString(originalArray));
			// System.out.println("Expected Array       : " + Arrays.toString(expectedArray));
			// System.out.println("My Array             : " + Arrays.toString(myArray));

			// if (Arrays.equals(expectedArray, myArray)) {
			// 	System.out.println("Success!");
			// 	System.out.println();
			// } else {
			// 	System.out.println("NOT equivalent!");
			// 	System.out.println();
			// }
		}
	}
	public static void main(String[] args) {
		// int[] a = {1, 5, 3, 1, 2, 8};
		// System.out.print("Original Array: "); System.out.println(Arrays.toString(a));
		// Sorts.bubbleSort(a);
		// System.out.println("Method call: Sorts.bubbleSort()");
		// System.out.print("Modified Array "); System.out.println(Arrays.toString(a));

		// System.out.println();

		// int[] b = {13, 8, 5, 3, 2, 1, 1, 0, -1};
		// System.out.print("Original Array: "); System.out.println(Arrays.toString(b));
		// Sorts.bubbleSort(b);
		// System.out.println("Method call: Sorts.bubbleSort()");
		// System.out.print("Modified Array "); System.out.println(Arrays.toString(b));

		// System.out.println();

		// int[] c = {};
		// System.out.print("Original Array: "); System.out.println(Arrays.toString(c));
		// Sorts.bubbleSort(c);
		// System.out.println("Method call: Sorts.bubbleSort()");
		// System.out.print("Modified Array "); System.out.println(Arrays.toString(c));

		// testBubbleSort(true, 15);
		// testBubbleSort(false, 12);

		// int[] a = {1, 5, 3, 1, 2, 8};
		// System.out.print("Original Array: "); System.out.println(Arrays.toString(a));
		// Sorts.selectionSort(a);
		// System.out.println("Method call: Sorts.selectionSort()");
		// System.out.print("Modified Array "); System.out.println(Arrays.toString(a));

		// testSelectionSort(15, 1);

		int size = Integer.parseInt(args[0]);
		testBubbleSort(size, 1);
	}
}