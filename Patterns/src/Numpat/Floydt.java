package Numpat;

public class Floydt 
{
	public static void main(String[] args) 
	{
		int n=4,p=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(p++ +" ");
			}
			System.out.println();
		}
		
	}

}
