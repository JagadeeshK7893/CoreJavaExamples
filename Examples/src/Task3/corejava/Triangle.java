package Task3.corejava;

public class Triangle extends Shape{

	int breadth;
	int height;
	int side1,side2,side3;
	public Triangle(int breadth,int height,int side1,int side2,int side3)
	{
		this.breadth=breadth;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public void area()
	{
		double triangleArea=(0.5)*breadth*height;
		System.out.println("Triangle area is:"+triangleArea);
	}
	public void  perimeter()
	{
		int trianglePerimeter=side1+side2+side3;
		System.out.println("Triangle perimeter is:"+trianglePerimeter);
	}
}
