package lec4array;

public class Maximum_sum_subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.print(Maxsum(arr));

	}

	public static int Maxsum(int[] arr) {
		int ans = Integer.MIN_VALUE;// 2^31
		for (int i = 0; i < arr.length; i++) {
			int previous_sum = 0;
			for (int j = i; j < arr.length; j++) {
				previous_sum += arr[j];
				ans = Math.max(ans, previous_sum);
			}
		}
		return ans;

	}

}
