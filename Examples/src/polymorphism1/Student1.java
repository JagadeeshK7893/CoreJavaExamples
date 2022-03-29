package polymorphism1;

public class Student1
{
   public void subject(String subjectName, double time)
   {
	   System.out.println("learnig...."+subjectName+" at "+time+"'o clock");
   }
   public void subject(double time,String subjectName)
   {
	   System.out.println("learnig.."+subjectName+" at "+time+"'o clock");
   }
}
