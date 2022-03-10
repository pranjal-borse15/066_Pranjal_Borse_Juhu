class Q13{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			int a=64;
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char) (a+i)+" ");
			}
			System.out.println();
		}
	}
}

/*
	A
   B B
  C C C
 D D D D
E E E E E
*/