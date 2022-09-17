package pattern_questons_pratice;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		if(a >= 97 && a  <  122)
		{
			System.out.println("lower case");
		} else if(a>=65 && a<=91 ) {
			System.out.println("upper case");
		}else {
			System.out.println("Invalid");
		
		}
	}

}
