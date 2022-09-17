package lec3;

import java.util.Scanner;

public class Pattern_double_sided_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int space1 = n - 1;
		int space2 = -1;
		int star = 1;
		int val = 1;

		while (row <= n) {

			int i = 1;
			while (i <= space1) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			int p = val;
			while (j <= star) {
				System.out.print(p + " ");
				p--;
				j++;
			}
			int k = 1;
			while (k <= space2) {
				System.out.print("  ");
				k++;
			}
			j = 1;
			p++;
			if (row == 1 || row == n) {
				j = 2;
			}
			while (j <= star) {
				System.out.print(p + " ");
				p++;
				j++;

			}
			// next row ki preparation
			if (row <= n / 2) {
				star++;
				space1 -= 2;
				space2 += 2;
				val++;

			} else {
				star--;
				space1 += 2;
				space2 -= 2;
				val--;
			}
			row++;
			System.out.println();

		}

	}
}
