/*program of nested if else*/
import java.util.*;
public class Nested_if
{
public static void main(String sgr[])
{
int id,sal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the student id : ");
 id =sc.nextInt();

if(id>=1 && id<=100)
{
  System.out.println("Enter the employee salary");
   sal=sc.nextInt();

   if(sal>=10000)
	{
	System.out.println("The employee is permanent");
	}
	else
	{
	System.out.println("the employee is temperory");
	}
}
else
{
System.out.println("The employee is invaid:");
}
}
}