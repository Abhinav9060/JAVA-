package lec_001;

public class Max_of_3_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 65;
		int b = 55;
		int c = 43;

		if (a > b && a > c) {
			System.out.println(a);
		}
		else if (b > c && b > a) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}

}
