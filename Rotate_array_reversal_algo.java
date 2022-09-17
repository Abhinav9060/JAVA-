package lec4array;

public class Rotate_array_reversal_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		Rotatearray(arr , k);
		for(int i=0; i<=arr.length-1;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	public static void Rotatearray(int[] arr, int k) {
		k = k % arr.length;
		int n = arr.length;
		reverse(arr, 0, n - k - 1);// 1s n-k elem ko reverse kia
		reverse(arr, n - k, n - 1);// 2nd last ka reverse kia
		reverse(arr, 0, n - 1);// ye pure array ko reverse kia

	}

	public static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++; 
			j--;
		}
	}

}
