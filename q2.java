import java.util.Scanner;
class q2
{
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int n1=sc.nextInt();
	long factorial=1;
			for(int i=1;i<=n1;i++)
		   {
			factorial=factorial*i;
		   }
		   {
			   System.out.println("Result is "+factorial);
		   }
		
	}		
}