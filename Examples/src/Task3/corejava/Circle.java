package Task3.corejava;

public class Circle extends Shape{
	
		float pi=3.14f;
		float radius;
		Circle( float radius){
		this.radius=radius;
		}
		public void area()
		{
			float circlearea=pi*(radius*radius);
			System.out.println("area of Circle:"+circlearea);
		}
	public void perimeter()
	{
		float circlePerimeter=2*pi*radius;
		System.out.println("perimeter of Circle"+circlePerimeter);
	} 

}
