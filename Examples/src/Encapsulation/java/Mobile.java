package Encapsulation.java;

public class Mobile {
     
	 private int code;
	 
	 public void setCode(int code1)
	 {
		 code=code1;
	 }
	 
	 public int getCode()
	 {
		 return code;
	 }
	 public static void main(String[] args)
	 {
		 Mobile key=new Mobile();
		 key.setCode(1542);
		 int k1=key.getCode();
		 System.out.println(k1);
	 }
}
