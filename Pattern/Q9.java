class Q9{
	 public static void main(String args[])
	 {
	
		for (int i=1;i<=5;i++)
		{
			int a=65;
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print((char) a+" ");
				;
		    }
			
			System.out.println();
		}
	}
}

 

/*
    A
   A B
  A B C
 A B C D
A B C D E

*/
