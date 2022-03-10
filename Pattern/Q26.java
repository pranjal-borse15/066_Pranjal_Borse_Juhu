class Q26{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			 System.out.print("*");
			}
			System.out.println();
		}
		for(int l=4;l<=8;l++)
		{
			for(int m=8;m>=l;m--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
*
**
***
****
*****
****
***
**
*
*/