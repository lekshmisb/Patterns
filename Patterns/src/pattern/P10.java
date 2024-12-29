package pattern;

public class P10 
{
	public static void main(String[] args)
	{
		int n=4;
		int orginalN=n;
		n=2*n;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				int ateveryIndex=orginalN-Math.min(Math.min(i, j),Math.min(n-i,n-j));
				System.out.print(ateveryIndex + " ");
			}
			System.out.println();
		}
		
		
	}

}
