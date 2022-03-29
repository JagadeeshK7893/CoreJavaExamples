package Composition;

public class Human {
	Heart pump;
	Lungs air;
	public Human(Heart pump,Lungs air)
	{
	this.pump=pump;
	this.air=air;
	}
	public void display() {
		pump.functioning();
		air.functionality();
	}

	public static void main(String[] args) {
     Heart obj1=new Heart();
     Lungs obj2=new Lungs();
     Human body=new Human(obj1,obj2);
     body.display();
	}
}
