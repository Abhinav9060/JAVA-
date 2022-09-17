package pattern_questons_pratice;

import java.util.Scanner;

public class Print_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		for (int num = 1; num <= n; num++) {
			count = 0;
			for (int i = 2; i <= num/2 ; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && num != 1) {
				System.out.println(num);
			}
		}
	}

}
