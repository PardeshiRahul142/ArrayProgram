import java.util.*;
public class Bonus 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the salary ");
int Salary= sc.nextInt();
System.out.print("Enter the Service do how many year:");
int Service = sc.nextInt();

if(Service > 5)
{
int bonus = Salary* 5 / 100;
System.out.print("amount of bonus is : "+bonus);
}
else
{
System.out.print("not eligible for bonus");
}
}
}