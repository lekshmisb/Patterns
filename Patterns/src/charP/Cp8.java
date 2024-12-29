package charP;

public class Cp8 
{
	public static void main(String[] args) 
	{
		// change in column characters
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1,p='A';j<=i;j++,p++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println();
		}
		
		
	}

}
