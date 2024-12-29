package Numpat;

public class Np1 
{
	public static void main(String[] args) 
	{
		// what is the pattern
		// what is the number in it
		int n=5;
		for(int i=1,p=1;i<=n;i++,p++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
	}

}
