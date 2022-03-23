package cj1;

import java.util.Scanner;

public class LoopsAndContinue {
	static void oddNumbers()
	{
		System.out.println("enter the limit..");
		Scanner ss=new Scanner(System.in);
		int limit=ss.nextInt();
	   for(int n=1;n<limit;n++)
	   {
		   int temp=n;
			   if(temp%2==0)
			   {
				   continue;
			   }
			   System.out.println(n+".....is odd number");
		   }
	   }

	public static void main(String[] args) {
     LoopsAndContinue.oddNumbers();

	}

}
