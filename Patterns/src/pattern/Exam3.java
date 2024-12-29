package pattern;

public class Exam3 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=0;i<2*n;i++)
		{
			//column in row
			
			int k=i>n?2*n-i:i;
			for(int j=0;j<k;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<2*n;i++)
		{
			//column in row
			
			int k=i>n?2*n-i:i;
			for(int j=0;j<k;j++) 
			{
				System.out.print("*");
				}
			System.out.println();
		}
		
	}


}
