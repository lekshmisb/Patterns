package Numpat;

public class Np12 
{
	public static void main(String[] args) 
	{
		// n,n-1,n-2,n-3
		int n=4;
		for(int i=1,k=n;i<=n;i++,k--)
		{
			int p=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			
			for(int j=i;j<=n;j++)
			{
				System.out.print(p-- +" ");
			}
			System.out.println();
		}
		
	}

}
