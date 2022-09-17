package lec3;

import java.util.Scanner;

public class Pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int space = 2 * n - 3;
		int row = 1;
		int star = 1;

		while (row <= n) {
			// star

			int i = 1;
			int val = 1;

			while (i <= star) {
				System.out.print(val + " ");
				val++;
				i++;

			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k = 1;
			val--;
			if (row == n) {
				k = 2;
				val--;
			}

			while (k <= star) {
				System.out.print(val + " ");
				k++;
				val--;

			}
			if (row <= n) {
				star++;
				space -= 2;
			}
			System.out.println();
			row++;
			// star++;
			// space-=2;

		}

	}

}
