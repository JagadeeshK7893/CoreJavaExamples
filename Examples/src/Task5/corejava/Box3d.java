package Task5.corejava;
import java.util.Scanner;

public class Box3d extends Box {

	public Box3d(double length, double breadth, double height) {
		super(length, breadth, height);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values to calcule volume and area");
		Box3d obj=new Box3d(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		obj.area();
		obj.volume();
		
	}

}
