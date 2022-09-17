package pattern_questons_pratice;

import java.util.Scanner;

public class Replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans=0;
		int mul =1;
		if(n==0) {
			ans = 5;
		}
		
		while(n>0) {
			int rem = (int) (n%10);
			
				if(rem==0) {
					ans = ans+5*mul;
				
			}else {
				ans = ans +rem*mul;
		
				
			}
				n/=10;
				mul*=10;
		}
		System.out.println(ans);

	}

}
