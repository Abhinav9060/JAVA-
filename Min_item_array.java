package lec4array;

public class Min_item_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 10, 12, 14, -1 };
		System.out.println(Minimum(arr));
	}

	public static int Minimum(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;

	}

}
