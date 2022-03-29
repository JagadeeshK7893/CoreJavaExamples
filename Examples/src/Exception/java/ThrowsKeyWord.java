package Exception.java;

public class ThrowsKeyWord {

	public static void main(String[] args) {
      try {
    	  handle();
      }
      catch(ArithmeticException e)
      {
    	  System.out.println(e);
      }
		
     }
	static void handle()throws ArithmeticException {

	 int i=50/0;
	}
}
