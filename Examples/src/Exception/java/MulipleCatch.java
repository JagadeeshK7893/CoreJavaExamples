package Exception.java;

public class MulipleCatch {

	public static void main(String[] args) {
		try {
			int i=9/0;
			int[] array=new int[4];
			array[5]=90;
		}
		catch(ArithmeticException e)
		{
			System.out.println("we can not devide any number by zero because of"+e);
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("we can insert upto the array length-1 index only because of:"+b);
		}
	}
}
