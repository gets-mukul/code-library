package Sorting;

public class MergeSort {

	public static void mergeSort(int[] array, int length) {
		if (length < 2) {
			return;
		}

		int mid = length / 2;

		// creating left smaller array
		int[] left = new int[mid];

		// creating right smaller array
		int[] right = new int[length - mid];

		// copying all element from original array to left arrays
		for (int i = 0; i < mid; i++) {
			left[i] = array[i];
		}

		// copying all element from original array to right arrays
		for (int i = mid; i < length; i++) {
			right[i-mid] = array[i];
		}

		mergeSort(left, mid);
		mergeSort(right, length-mid);

		merge(array, left, right, mid, length-mid);

	}

	public static void merge(int[] array, int[] left, int[] right, int ll, int rl) {
		int i = 0, j = 0, k = 0;

		while (i < ll && j < rl) {
			if (left[i] <= right[j]) {
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}
		while (j < rl) {
			array[k++] = right[j++];
		}
		while (i < ll) {
			array[k++] = left[i++];
		}
	}

	public static void main(String[] args) {

		int[] array = new int[] { 6, 3, 7, 9, 4 };

		System.out.println("Before sorting : ");

		for (int x : array) {
			System.out.print(x + " ");
		}

		mergeSort(array, array.length);

		System.out.println();

		System.out.println("After sorting : ");

		for (int x : array) {
			System.out.print(x + " ");
		}
	}

}
