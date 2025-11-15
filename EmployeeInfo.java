/*Q.2
Create a class Employee with empId, empName, and salary.

Requirements:
Use a method inputData() to set values.

Use a method showDetails() to display details with  10% bonous on salary.

Create and test 2 employee objects.
*/
import java.util.*;
class Emp
{
  int empId;
  String name;
  int salary;
  int bonus=0;
  public void inputData()
  {
    Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the emp Id :");
	empId=sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter the emp name :");
	name=sc.nextLine();
	
	System.out.println("Enter the salary :");
	    salary = sc.nextInt();
	 bonus=salary * 10 / 100;
	   
	}
	public void showDetails()
	{
	System.out.println("The employee id is :"+empId);
	System.out.println("The employee name is :"+name);
	System.out.println("The employee Salary is :"+salary);
	System.out.println("The employee bonus is :"+bonous);
	}
}
public class EmployeeInfo
{
  public static void main(String args[])
  {
    Emp emp=new Emp();
	Emp emp1=new Emp();
	
	System.out.println("Enter the first employe data :");
	emp.inputData();
	
	System.out.println("Enter the second employe data :");
	emp1.inputData();
	
	System.out.println("The first Employe details is :");
	emp.showDetails();
	
	System.out.println("The second Employe details is :");
	emp1.showDetails();
  }
}
	