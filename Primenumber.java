package pattern_questons_pratice;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int n= sc.nextInt();
         
         int fact =0;
         
         for(int i=2; i<n; i++) {
        	 if(n%i!=0) {
        		 fact++;
        	 }
        	 
    
         }
         if(fact>=1) {
        	 System.out.println("NOT PRIME");
         }
         else {
        	 System.out.println("PRIME NUMBER");
         }
	}
	
	

}
