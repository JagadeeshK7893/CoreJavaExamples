package ExceptionHandlingTasks;

public class Task2 {

	public static void main(String[] args) {
      try {
		String s=null;
		System.out.println(s.length());	
      }
      catch(NullPointerException e)
      {
    	  System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException k)
      {
    	  System.out.println(k);
      }
      catch(Exception s)
      {
    	  System.out.println(s);
      }
	}
}
