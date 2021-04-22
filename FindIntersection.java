package week1.day2;

public class FindIntersection {

	public static void main(String[] args) 
	{
		
		int[] A1= {3,2,11,4,6,7};
		int[] A2= {1,2,8,4,7,9};
		
		for(int i=0;i<A1.length;i++)
		{
			for(int j=0;j<A2.length;j++)
			{
				if(A1[i] == A2[j])
				{
					System.out.println(A2[j]);
				}
			}
		}
		

	}

}
