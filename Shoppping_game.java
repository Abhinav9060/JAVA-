package pattern_questons_pratice;

import java.util.Scanner;

public class Shoppping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
		int  m = sc.nextInt();
		int n = sc.nextInt();
		
		int aayush_total_phone =0;
		int harshit_total_phone =0;
		int curr =1;
		
		while(true) {
			
			aayush_total_phone+=curr;
			if(aayush_total_phone>m) {
				System.out.println("Harshit");
				break;
			}
			curr++;
			harshit_total_phone+=curr;
			if(harshit_total_phone>n) {
				System.out.println("Aayush");
				break;
			}
			curr++;
		}

	}
	}
}
