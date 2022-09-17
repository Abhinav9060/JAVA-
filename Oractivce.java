package pattern_questons_pratice;

public class Oractivce {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int n = 321;
		int ans=0;
		while(n>0) {
			int rem =n%10;
			ans = ans*10 +10-rem;
			n/=10;
			
		}
		//n/=10;
		System.out.println(ans);

	}

}
