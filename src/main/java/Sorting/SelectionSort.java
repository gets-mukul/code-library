package Sorting;

public class SelectionSort {

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			swap(i, min, array);
		}
	}

	public static void swap(int i, int j, int[] array) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 6, 2, 7, 9, 3, 5 };

		System.out.println("Before sorting :");
		for (int x : array) {
			System.out.print(x + " ");
		}

		System.out.println();

		selectionSort(array);

		System.out.println("After sorting : ");

		for (int x : array) {
			System.out.print(x + " ");
		}

	}

}
