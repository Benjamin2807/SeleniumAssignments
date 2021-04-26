package week1.day2;

import java.util.Scanner;

public class Fibonicci {

	private static Scanner sc;

	public static void main(String[] args) {
		
		System.out.println("enter the Number");
		sc = new Scanner(System.in);
		int range = sc.nextInt();
		int Firstnum= 0;
		int secondnum = 1;
		int result = 0;	System.out.print(Firstnum+" ");
		
		for(int i = 1; i<range; i++)
		{
	        result = Firstnum + secondnum;
			Firstnum = secondnum;
			secondnum = result;
			System.out.print(result+" ");
		}
		
	}

}
