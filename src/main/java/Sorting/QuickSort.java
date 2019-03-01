package Sorting;

public class QuickSort {
	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);

			// left sub array
			quickSort(array, start, pivot - 1);

			// right subarray
			quickSort(array, pivot + 1, end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];

		int i = (start - 1);

		for (int j = start; j < end; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		int[] array = new int[] { 3,9,2,7,4,6 };

		System.out.println("Before sorting : ");

		for (int x : array) {
			System.out.print(x + " ");
		}

		quickSort(array, 0, array.length - 1);

		System.out.println();

		System.out.println("After sorting : ");

		for (int x : array) {
			System.out.print(x + " ");

		}
	}
}
