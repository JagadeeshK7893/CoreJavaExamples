package Task1.Corejava;
import java.util.Scanner;

public class ContactNumbers {
	String name;
	long phno1,phno2;
	void mobileNo(String name)
	{
		this.name=name;
	}
	
	void mobileNo(long phno1,long phno2)
	{
		this.phno1=phno1;
		this.phno2=phno2;
		System.out.println("contact name is:"+name);
		System.out.println("mobiel numbers are:"+phno1+"and"+phno2);
	}

	public static void main(String[] args) {

		ContactNumbers num=new ContactNumbers();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name: ");
		num.mobileNo(sc.next());
		System.out.println("enter your numbers..:");
		num.mobileNo(sc.nextLong(),sc.nextLong());
		
	}

}
