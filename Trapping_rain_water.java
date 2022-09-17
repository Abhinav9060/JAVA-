package lec4array;

public class Trapping_rain_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(Trappingrainwater(arr));
		

	}
	public static int Trappingrainwater(int[] arr) {
		int n = arr.length;
		int [] left = new int [n];
		int [] right = new int [n];
		left[0]= arr[0];
		for(int i=1; i<arr.length; i++) {
			left[i]= Math.max(left[i-1], arr[i]);
		}
		right[n-1]= arr[n-1];
		for(int i = n-2; i>=0; i--) {
			right[i]= Math.max(right[i+1], arr[i]);
		}
		int ans =0;
		for(int i=0; i<arr.length; i++) {
			int min = Math.min(left[i], right[i]);
			ans = ans + (min - arr[i]);
		}
		return ans;
	}

}
