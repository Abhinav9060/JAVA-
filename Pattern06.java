package pattern_questons_pratice;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int space = 0;
		int row = 1;
		while (row <= n) {
			// space

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print("*" + " ");
				j++;
			}

			row++;
			star--;
			space+=2;
			System.out.println();

		}

	}

}
