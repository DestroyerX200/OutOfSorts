import java.util.Arrays;
public class Sorts {
	/**Bubble sort of an int array. 
	*@postcondition The array will be modified such that the elements will be in increasing order.
	*@param data  the elements to be sorted.
	*/
	public static void bubbleSort(int[] data) {
		boolean isSorted = false;
		int j = data.length;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < j-1; i++) {
				if (data[i] > data[i+1] ) {
					int temp = data[i];
					data[i] = data[i+1];
					data[i+1] = temp;
					isSorted = false;
				}
			}
			j--;
		}
	}
	public static void selectionSort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			int smallestElement = data[i];
			int indexOfSwap = i;
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < smallestElement) {
					smallestElement = data[j];
					indexOfSwap = j;
				}
			}
			if (smallestElement != data[i]) {
				int temp = data[i];
				data[i] = smallestElement;
				data[indexOfSwap] = temp;
				// System.out.println(Arrays.toString(data));
			}
		}
	}
}
