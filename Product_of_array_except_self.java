package lec4array;

import java.util.Scanner;

public class Product_of_array_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr = {2, 4 ,5 ,6};
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int [N];
		for(int i=0; i<N; i++) {
			arr[i]= sc.nextInt();
		}
		product(arr);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int[] product(int[]arr) {
		int n =arr.length;
		int [] left = new int [n]; 
		int [] right = new int [n];
		left[0]=1;
		for(int i =1; i<n; i++) {
			left[i]= left[i-1]*arr[i-1];
		}
		right[n-1]=1;
		for(int i=n-2; i>=0; i--) {
			right[i]= right[i+1]*arr[i+1];
		}
		for(int i=0; i<arr.length;i++) {
			arr[i]= left[i]*right[i];
		}
		
	return arr;
	}

}
