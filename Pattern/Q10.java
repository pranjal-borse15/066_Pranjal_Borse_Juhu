class Q10{
	 public static void main(String args[])
	 {
		
		for (int i=5;i>=1;i--)
		{
			int a=64;
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++)
			{
				
				System.out.print((char) (a+j)+" ");
				
		    }
		
			System.out.println();
			
		}
	}
}