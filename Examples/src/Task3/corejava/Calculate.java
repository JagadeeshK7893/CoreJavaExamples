package Task3.corejava;
import java.util.Scanner;

 public class Calculate {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter values for triangle...");
    Shape type=new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    type.area();
    type.perimeter();
    System.out.println("enter values for Circle...");
    type=new Circle(sc.nextFloat());
    type.area();
    type.perimeter();
    System.out.println("enter values for Square....");
    type=new Square(sc.nextInt(),sc.nextInt());
    type.area();
    type.perimeter();
	}
}
