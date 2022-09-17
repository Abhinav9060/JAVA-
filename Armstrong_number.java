package lec3;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(Isarmstrongnumber(n));
		
	}
	public static boolean Isarmstrongnumber(int n) {
		int d = countofdigit(n);
		int ans =0;
		int temp=n;
		
		while(n>0) {
			int rem =n % 10;
			ans = (int) (ans+Math.pow(rem, d));
			n/=10;
		}
		if(ans==temp) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static int countofdigit(int n) {
		int c =0;
		while(n>0) {
			n/=10;
			c++;
		}
		return c;
	}

}
