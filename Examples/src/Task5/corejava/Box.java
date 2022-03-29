package Task5.corejava;

public class Box {
	double length,breadth,height;
	public Box(double length,double breadth,double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	public void area()
	{
		double area1=length*breadth;
		System.out.println("area is:"+area1);
	}
	public void volume()
	{
		double volume1=length*breadth*height;
		System.out.println("volume is:"+volume1);
	}
}
