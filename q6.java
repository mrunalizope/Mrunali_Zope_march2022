import java.util.Scanner;
class q6
{
public static void main(String args[])
{
int year;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Year");
year=sc.nextInt();
if(((year%4==0)&&(year%100!=0))||(year%400==0))
{System.out.println("Given Year is Leap Year...!!");
}
else
{System.out.println("Given Year is non Leap Year...!!");
}


}
}
