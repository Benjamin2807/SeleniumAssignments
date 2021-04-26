package week1.day2;

import java.util.Scanner;

public class SumOdDights {

	private static Scanner sc;

	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		System.out.println("enter the value");
		int a = sc.nextInt();
		int rem;
		int sum = 0;
		while(a!=0)
		{
			rem = a % 10;
			sum = sum + rem;
			a = a/10;
		}
		
	System.out.println(sum);	

	}

}
