import java.util.*;



public class Cal{
	public static void main(String args[]){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number:");
			int a = sc.nextInt();
			System.out.println("Enter second Number:");
			int b = sc.nextInt();
			
			System.out.println("Addition Is : "+a+"+"+b+"="+(a+b));
			System.out.println("Substraction Is : "+a+"-"+b+"="+(a-b));
			System.out.println("Multiplication Is : "+a+"*"+b+"="+(a*b));
			System.out.println("Multiplication Is : "+a+"/"+b+"="+(a/b));
			System.out.println("Multiplication Is : "+a+"%"+b+"="+(a%b));
		}	
	}	