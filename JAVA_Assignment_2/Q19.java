import java.util.*;

class Binary1{
	public static void main(String args[])
	{
	//	int rev=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the decimal number:");
		int n=sc.nextInt();
		String str = "";
		while(n>0)
		{
			int r=n%2;
			n=n/2;
			str = str + r;

		}
		System.out.println(str);
		String rev = new StringBuffer(str).reverse().toString();
	//	int  num = Integer.parseInt(str);
	//	System.out.println(num);
		rem=str%10;
		
		
		System.out.println("binary of number is:"+rev);
		
	}
}
		
		