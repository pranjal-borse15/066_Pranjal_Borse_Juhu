class Q25{
	public static void main(String args[])
	{
		for(int  i=1;i<=5;i++)
			
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
				
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}	
				System.out.println();
		}
		for(int m=10;m>=6;m--)
		{
			for(int p=9;p>=m;p--)
			{
				System.out.print(" ");
			}
			for(int n=6;n<=m;n++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}