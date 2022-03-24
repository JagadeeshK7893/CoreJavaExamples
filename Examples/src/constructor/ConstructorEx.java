package constructor;

public class ConstructorEx {
	int exp;
	String name;
	int age;
	public ConstructorEx(int exp,String name,int age)
	{
		this.exp=exp;
		this.name=name;
		this.age=age;
		
	}
	public ConstructorEx(String name,int exp,int age)
	{
		this.name=name;
		this.exp=exp;
		this.age=age;
	}
	void employeeDetails()
	{
		System.out.println(exp+"  "+name+"  "+age);
	}

	public static void main(String[] args) {
		ConstructorEx emp1=new ConstructorEx(3,"Prasanth",26);
		ConstructorEx emp2=new ConstructorEx("jagadeeh",1,21);
		emp1.employeeDetails(); 
		emp2.employeeDetails();

	}

}
