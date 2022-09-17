package lec4array;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Two pointer approach
		int[] arr = { 10, 20, 30, 40 , 50};
		Reversearray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public static void Reversearray(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
