package lec4array;

import java.util.Scanner;

public class Reverse_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {20 , 30, 40, 2 ,3, 4, 5,9 ,7,1,};
		//int i =2;
		//int j=5;
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		reverse(arr, i , j);
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}

	}
	public static void reverse(int[]arr , int i , int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
	}

}
