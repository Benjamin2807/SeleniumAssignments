package week1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	private static Scanner sc;

	public static void main(String[] args) {
	 
		System.out.println("enter the 2 Strings");
		sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		if(str1.length()==str2.length())
		{
			char[] charArray = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			
			System.out.println(charArray);
			System.out.println(charArray2);
			
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			
			System.out.println(charArray);
			System.out.println(charArray2);
			
		
			 str1 = Arrays.toString(charArray);
			 str2 = Arrays.toString(charArray2);
			
			if(str1.equalsIgnoreCase(str2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
			
		}
		
		else
		{
			System.out.println("Condition not met");
		}
		
		

	}

}
