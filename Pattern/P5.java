class P5{
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				sum=sum+j;
				System.out.print(j);
				System.out.print(" "+sum+" ");
			}
			
			System.out.println();
		}
		
	}
}
	