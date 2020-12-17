import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class Tester {
	public static int testBubbleSort(boolean seeAllTestCases, int sizeOfList) {
		for (int i = 0; i < 1000; i++) {
			Random rng = new Random(i);
			int[] originalArray = new int[sizeOfList];

			for (int j = 0; j < sizeOfList; j++) {
				int randomParity = new Random().nextInt() % 2;
				int negativeOrNot = -1;
				if (randomParity == 0) {
					negativeOrNot = 1;
				}
				originalArray[j] = rng.nextInt() % 1000 * negativeOrNot; 
			}

			int[] myArray = Arrays.copyOf(originalArray, originalArray.length);
			Sorts.bubbleSort(myArray);

			int[] expectedArray = Arrays.copyOf(originalArray, originalArray.length);
			Arrays.parallelSort(expectedArray);

			if (seeAllTestCases) {
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

			} else {
				if (!Arrays.equals(expectedArray, myArray)) {
				System.out.println("Random Original Array: " + Arrays.toString(originalArray));
				System.out.println("Expected Array       : " + Arrays.toString(expectedArray));
				System.out.println("My Array             : " + Arrays.toString(myArray));
				System.out.println("NOT equivalent!");
				return 0;
				} else {
					System.out.println("Success!, every test case was correct!");
					return 0;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] a = {1, 5, 3, 1, 2, 8};
		System.out.print("Original Array: "); System.out.println(Arrays.toString(a));
		Sorts.bubbleSort(a);
		System.out.println("Method call: Sorts.bubbleSort()");
		System.out.print("Modified Array "); System.out.println(Arrays.toString(a));

		System.out.println();

		int[] b = {13, 8, 5, 3, 2, 1, 1, 0, -1};
		System.out.print("Original Array: "); System.out.println(Arrays.toString(b));
		Sorts.bubbleSort(b);
		System.out.println("Method call: Sorts.bubbleSort()");
		System.out.print("Modified Array "); System.out.println(Arrays.toString(b));

		System.out.println();

		int[] c = {};
		System.out.print("Original Array: "); System.out.println(Arrays.toString(c));
		Sorts.bubbleSort(c);
		System.out.println("Method call: Sorts.bubbleSort()");
		System.out.print("Modified Array "); System.out.println(Arrays.toString(c));

		testBubbleSort(true, 15);
		testBubbleSort(false, 12);
	}
}