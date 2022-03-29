package Exception.java;

public class ThrowKeyWordEx
{
	public static void Validate(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("person doesn't allow to vote..");
		}
		else
		{
			System.out.println("person is elligible for vote...");
		}
		
	}
	public static void main(String[] args)
	{
		ThrowKeyWordEx.Validate(17);
	}
}
