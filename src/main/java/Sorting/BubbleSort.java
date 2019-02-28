package Sorting;

public class BubbleSort {

	public static void bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					swap(i, j, array);
				}
			}
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

		bubbleSort(array);

		System.out.println("After sorting : ");

		for (int x : array) {
			System.out.print(x + " ");
		}

	}

}
