package cj1;

import java.util.Scanner;

public class IfElse {
	public static void vote()
	{
		System.out.println("enter your age..");
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		if(age>=18)
		{
			System.out.println("you are eligible for voting.....");
		}
		else
		{
			System.out.println("you arenot eligible for voting");
		}
	}

	public static void main(String[] args) {
         IfElse.vote();
	}

}
