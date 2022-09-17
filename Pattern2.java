package pattern_questons_pratice;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		while (row <= n) // for row intial
		{
			// printing star
			int i = 1;
			while (i <= star) {
				System.out.print(i * i + " ");
				i++;

			}
			// next row ki preparation
			row++;
			star++;

			System.out.println();
		}

	}

}
