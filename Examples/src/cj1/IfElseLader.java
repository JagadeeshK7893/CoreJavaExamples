package cj1;
import java.util.Scanner;

public class IfElseLader {

	public static void main(String[] args) {
		System.out.println("enter  number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<10)
		{
			System.out.println("number is in range1-10");
		}
		else if(num>=10 && num<=20)
		{
			System.out.println("number is in range10-20");
		}
		else if(num>=20 && num<=30)
		{
			System.out.println("number is in range1-30");
		}
		else
		{
			System.out.println("number is more than 30");
		}
		

	}

}
