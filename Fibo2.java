package pattern_questons_pratice;

import java.util.Scanner;

public class Fibo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 1;
		int b = 2;

		for (int i = 1; i < n; i++) {
			int c = a + b;

			a = b;
			b = c;

		}

		System.out.println(b);

	}

}
