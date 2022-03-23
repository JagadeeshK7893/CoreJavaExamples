package cj1;
import java.util.Scanner;

public class WhileLoop {
   int n;
   public WhileLoop(int n)
   {
	  this.n=n;
   }
	public void Palindrome()
	{
		
		int sum=0;
		int rem;
		int temp=n;
		while(temp>0) {
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println(n+".. is a palindrome number");
		}
		else
		{
			System.out.println(n+"..is not a palindrome");
		}
	}
	public static void main(String[] args) {
		System.out.println("enter number to check the numer is palindrome...or not...");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		WhileLoop obj=new WhileLoop(num); 
		obj.Palindrome();
	}	
}
