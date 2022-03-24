package aggregation;
class Stu
	{
		int rollno;
		String name;
		int age;
		Address adr;
		public Stu(int rollno,String name,int age,Address adr)
		{
			this.rollno=rollno;
			this.name=name;
			this.age=age;
			this.adr=adr;
		}
		public void details()
		{ 
			System.out.println("rollno="+rollno+" "+"name="+ name +" "+"age="+ age);
			System.out.println("village="+adr.village+" "+"distict="+adr.distict+" "+"state="+adr.state);
		}
	}
class Address
	{
		String village,distict,state;
		public Address(String village,String distict,String state)
		{
			this.village=village;
			this.distict=distict;
			this.state=state;
		}
	}
public class AggregationEx {
	public static void main(String[] args) {
	Address adr1=new Address("laxmipuram","srikakulam","A.p");
	Stu adr2=new Stu(1,"jaggu",21,adr1);
	adr2.details();
	
			
	}

}
