package lec4array;

import java.util.Scanner;

public class Max_item_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int []arr = {10, 20, -3 , 45, 32,22};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maximum(arr));

	}
	public static int maximum(int[]arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
   
}
