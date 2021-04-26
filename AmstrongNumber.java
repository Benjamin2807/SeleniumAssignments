package week1.day2;

import java.util.Scanner;

public class AmstrongNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int number,reminder;
		int result =0;
		int temp =0;
		System.out.println("enter the Number");
		sc = new Scanner(System.in);
		number = sc.nextInt();
		temp = number;
		
	while(number>0)
	{
		reminder = number % 10;
		result = result + (reminder*reminder*reminder);
		number = number/10;
	}
		if(result==temp)
		{
			System.out.println(result);
			System.out.println("Hence Amstrong");
		}

		else
		{
			System.out.println(result);
			System.out.println("Not an Amstrong");
		}
	}

}
