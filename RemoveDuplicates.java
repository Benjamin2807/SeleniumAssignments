package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int counter = 0;
		
		String str = " My name is not your name";
		String[] split = str.split(" ");
		int len = split.length;
		for(int i = 0; i<len; i++) 
		{
			for(int j=i+1; j<len; j++)
			{
				if(split[i].equalsIgnoreCase(split[j]))
                 {
	             
					counter++;
                 
                 }
			
			if(counter>0)
			{
				str = str.replaceAll(split[i]," ");
				counter=0;
			}
			
			}
			
		}
		

		System.out.println(str);
		
	}

}
