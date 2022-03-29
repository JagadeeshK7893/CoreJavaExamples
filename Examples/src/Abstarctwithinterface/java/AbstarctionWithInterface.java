package Abstarctwithinterface.java;

public class AbstarctionWithInterface implements Company,Employee {
	public void work()
	{
		System.out.println("company is working...from monday to friday");
	}
    public void leaves()
    {
    	System.out.println("holiday for employees in weakend in companies.. ");
    }
	public static void main(String[] args) {

		AbstarctionWithInterface Emp1=new AbstarctionWithInterface();
		Emp1.work();
		Emp1.leaves();

	}

}
