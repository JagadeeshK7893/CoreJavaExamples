package cj1;
public class ForLoopAndBreak {
	public static void primeNumbers()
	{
		int count;
		int n;
		boolean flag; 
		for(n=2;n<100;n++)
		{
			count=0;
			flag=false;
			for(int i=1;i<=n/2;i++)
			{
					if(n%i==0)
					{
						count++;
					}
			if(count==2) {
				flag=true;
				break;
			}
			}
			if(flag==true)
			{
				System.out.println(n+"..is not prime number");
			}
			else
			{
				System.out.println(n+"..is prime number");
			}
		}
	}
	public static void main(String[] args) {
     ForLoopAndBreak.primeNumbers();
	}

}
