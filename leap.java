import java.util.Scanner;
class Leap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%4==0) && (n%100!=0))
 {
		System.out.println("leap year");
	}
		else if(n%100==0)
	{
		System.out.println("Not leap year");
	}
		else if(n%400==0)
  {
		System.out.println("leap year");
   }
		else
		{
		System.out.println("Not leap year");
		}
	}
}
