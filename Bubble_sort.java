package lec4array;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,3,5,9,4,6,8};
		sort(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int[] arr) {
		for(int pass=1;pass <arr.length; pass++) {
			for(int i=0;i<arr.length-pass; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]= arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}

}
