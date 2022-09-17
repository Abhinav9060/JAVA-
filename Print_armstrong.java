package lec3;

import java.util.Scanner;

public class Print_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		 for (int i = n1; i < n2; i++) {
	            if (Isarmstrongnumber(i)) {
	                System.out.println(i + " ");
	            }
	        }
	    }
				//System.out.println(Isarmstrongnumber(i));

			
			
			

		//System.out.println(Isarmstrongnumber(i));
		
		
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


