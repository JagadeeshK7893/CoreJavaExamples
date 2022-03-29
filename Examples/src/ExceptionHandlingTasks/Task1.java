package ExceptionHandlingTasks;

import java.util.Scanner;

class InvalidEmployeeIdException extends Exception {

	public InvalidEmployeeIdException(String str) {
		super(str);
}
}
public class Task1{
	
	static void validate (int id) throws InvalidEmployeeIdException{    
		
	   if(id>100)
	   {
		   throw new InvalidEmployeeIdException("given Employee ID is not found or mismatched,plese enter valid Employee Id");
	   }
	   else
	   {
		   System.out.println("welcome to the Office..");
	   }
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Id:");
		try
		{
			validate(sc.nextInt());
		}
		catch(InvalidEmployeeIdException e)
		{
			System.out.println(e);
		}
		
	}
}
