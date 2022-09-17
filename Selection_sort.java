package lec4array;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 5, 1, 6, 7, 9 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}

			}

			int temp = arr [i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}

	}

}
