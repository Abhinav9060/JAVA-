package lec3;

public class ractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=999;
		int ans=0;
		int mul=1;
		
		while(n>0) {
			int rem =n%10;
			int t= 10-rem;
			ans=ans+t*mul;
			n/=10;
			mul*=10;

		}
		
		System.out.println(ans);

	}

}
