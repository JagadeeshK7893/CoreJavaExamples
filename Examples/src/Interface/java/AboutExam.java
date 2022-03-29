package Interface.java;
	
 class AboutExam implements Exam
	{
	public void results() {
		 System.out.println("Exam Pass...");
	 } 
	 public static void main(String[] args)
	 {
		 AboutExam Ex=new AboutExam();
		 Ex.results();
	 }
	 
}
