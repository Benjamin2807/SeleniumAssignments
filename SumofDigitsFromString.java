package week1.day2;

import java.util.Scanner;

public class SumofDigitsFromString {

	private static Scanner sc;

	public static void main(String[] args) {
		
		
		System.out.println("enter the String");
		sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		int value = 0;
		
	    char[] charArray = str.toCharArray();
	    System.out.println();
		
	    for(int i = 0; i<charArray.length; i++)
	    {
	    	if(Character.isDigit(charArray[i]));
	    	{
	    	    value = Character.getNumericValue(charArray[i]);
	    		sum = sum + value;
	    		
	    	}
	    }
	
	    
	    System.out.println(sum);
		
	}

}
