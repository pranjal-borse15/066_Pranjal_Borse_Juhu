class Q20{
	public static void main(String args[])
	{	
		for(int m=1;m<=4;m++)
		{
			for(int n=4;n>=m;n--)
			{
				System.out.print(" ");
			} 
			for(int p=1;p<=m;p++)
			{
				System.out.print("*");
			}
			for(int q=2;q<=m;q++)
			{
				System.out.print("*");
			}	
			System.out.println();
			
		}
			
		for (int i=5;i<=10;i++)
		{
		    for(int k=6;k<=i;k++)
			{
					System.out.print(" ");
			}
			for(int j=9;j>=i;j--)
			{
				System.out.print("*");
			
			}
			for(int l=8;l>=i;l--)
			{
				System.out.print("*");
			
			}
			
			System.out.println();
		}
	}
}

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/
