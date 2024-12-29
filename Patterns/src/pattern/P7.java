package pattern;

public class P7 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0;i<2*n;i++)
		{
			int k=i>n?2*n-i:i;
			
			int noofspaces=n-k;
			for(int s=0;s<noofspaces;s++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<k;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	}

}
