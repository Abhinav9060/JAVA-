package pattern_questons_pratice;

public class GCD_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int divisor = 36;
		int divident = 60;

		while (divident % divisor!= 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);
	}

}
