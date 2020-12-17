import java.util.Arrays;
public class Tester {
	public static void main(String[] args) {
		int[] a = {2, 5, 3, 1, 2, 8};
		Sorts.bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}