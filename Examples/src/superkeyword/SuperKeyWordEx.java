package superkeyword;
class Laptop
{
	void youtube()
	{
		System.out.println("watching cartoon..");
	}
}
class Mobile extends Laptop
{
	void prime()
	{
		System.out.println("watching movies..");
	}
	void youtube()
	{
		super.youtube();
		System.out.println("watching comedy scenes..");
	}
    
}
public class SuperKeyWordEx {

	public static void main(String[] args) {
    Mobile streaming=new Mobile();
    streaming.prime();
    streaming.youtube();

	}

}
