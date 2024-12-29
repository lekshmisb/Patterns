package hollowp;

public class Hp1 
{
	//print row by row we can't move to previous row
	//always start printing from left side of the screen
	
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n)
				{
					System.out.print("* ");
				}
				else
				{
					
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		
		
	}

}
