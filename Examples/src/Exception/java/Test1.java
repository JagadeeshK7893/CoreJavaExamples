package Exception.java;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Exception handling starts..");
		
		try {
			int i=50/0;
			System.out.println("Exception ends..");//in try block if we print any thing it will not print
		}
		catch(ArithmeticException s) 
		{
			System.out.println("Exception handled");
			
	    	
	}
	
		finally{
			System.out.println("final lines.. ");
		}
	}
}
