package pattern_questons_pratice;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;
		int row = 0;
		int star = 0;

		while (row < n) {
			int i = 0;
			int ncr = 1;
			while (i <= star) {
				System.out.print(ncr + " ");
				ncr = ((row - i) * ncr) / (i + 1);

				i++;
			}
			row++;
			System.out.println();
			star++;
		}

	}

}
