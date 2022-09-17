package pattern_questons_pratice;

import java.util.*;

public class Random_qps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int thousand = 0;

		int hundreds = 0;

		int tens = 0;

		System.out.print("Enter 6 digit number: ");
		int number = sc.nextInt();

		if (number <= 999999 && number > 99999)

		{

			thousand = (number / 1000) % 10;

			System.out.printf("thousands place digit: " + thousand);

			hundreds = (number / 100) % 10;

			System.out.printf("\nHundreds place digit: " + hundreds);

			tens = (number / 10) % 10;

			System.out.printf("\nTens place digit: " + tens);

		}

		else

		{

			if (number > 999999)

				System.out.println("\nError! Number more then 6  digits.");

			if (number < 99999)

				System.out.println("Error! Number less then 6 digits.");

		}
	}

}
