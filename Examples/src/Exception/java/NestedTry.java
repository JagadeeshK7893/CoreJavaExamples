package Exception.java;

public class NestedTry {

	public static void main(String[] args) {
       
	 try {
			 
			 try
			 {
				 int s=2/0;
			 }
			 catch(ArithmeticException e)
			 {
				 System.out.println(e);
			 }
			 try
			 {
				 int[] arr=new int[4];
				 arr[5]=5;
			 }
			 catch(ArrayIndexOutOfBoundsException a)
			 {
				 System.out.println(a);
			 }
		     catch(Exception c)
		     {
		     	 System.out.println(c);
		     }
	    }
		 finally {
			 System.out.println("all are handled");
		 }
	}
}
