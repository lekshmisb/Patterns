package charP;

public class Cp5 
{
	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				if(i%2==0)
				{
					System.out.print("O ");
				}
				else
				{
					System.out.print("Z ");
				}
			}
			System.out.println();
		}
		
	}

}
