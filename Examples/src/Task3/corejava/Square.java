package Task3.corejava;

public class Square extends Shape{
	int length;
	int breadth;
	public Square(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void area()
	{
		int squareArea=length*breadth;
		System.out.println("area of square is:"+squareArea);
	}
	public void  perimeter()
	{
		int squarePerimeter=2*(length+breadth);
		System.out.println("perimeter of Square"+squarePerimeter);
	}
	
}
