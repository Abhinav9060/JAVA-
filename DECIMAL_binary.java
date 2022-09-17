package lec3;

import java.util.Scanner;

public class DECIMAL_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n =45;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans =0;
		int mul=1;
		while(n>0) {
			int rem = n%2;
			ans = ans+rem*mul;
			mul*=10;
			n/=2;
			
		}
		System.out.println(ans);

	}

}
