package week1.day2;

public class ChangeOddindexToUpperCase {

	public static void main(String[] args) 
	{
		
		String str="Benjamin";
		char[] charArray = str.toCharArray();
		
		for(int i=0; i<charArray.length; i++)
		{
			if(i%2!=0)
			 {
				String str1 = Character.toString(charArray[i]);
				String str2 = str1.toUpperCase();
				System.out.print(str2);
				
		      }
			
			else
			{
				System.out.print(charArray[i]);
			}
		}
	
		
	}

}
