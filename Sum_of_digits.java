package pattern_questons_pratice;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum=0;
		
		//for(;n>0;) using for loop
		while(n>0){
			int rem = n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);

	}

}
