package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String str1 = "Malayalam";
		String str2 = "";
		char[] charArray = str1.toCharArray();
		int len = str1.length();
		for(int i=len-1; i>=0; i--)
		{
		    str2 +=Character.toString(charArray[i]);
		    
		}  
			if(str1.equalsIgnoreCase(str2))
			{
				System.out.println(str2);
				System.out.print("Palindrome");
			}
			
			else
			{
				System.out.println("Not a Palindorme");
			}
			
		}
		
		
	}


