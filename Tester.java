import java.util.Arrays;
public class Tester {
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
	}
}