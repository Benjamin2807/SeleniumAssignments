package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String str = "My name is Benjamin";
		String[] split = str.split(" ");
		
		for(int i=0; i<split.length; i++)
		{
			if(i%2==0)
			{
				System.out.print(split[i]+" ");
			} 
			
			else 
			{
				char[] charArray = split[i].toCharArray();
				
				for(int j=charArray.length-1; j>=0; j--)
				{
					System.out.print(charArray[j]);
					
				}
				
				System.out.print(" ");
			}
			
		}
		
		

	}

}
