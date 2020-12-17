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
}
