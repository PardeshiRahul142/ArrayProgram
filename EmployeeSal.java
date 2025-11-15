/* Q2. Write a java program to input basic salary of an employee and calculate its Gross salary according to following:
		Basic Salary <= 10000 : HRA = 20%,  DA =  80%
		Basic Salary <= 20000 : HRA = 25%, DA = 90%
		Basic Salary > 20000 : HRA = 30%,  DA =    95%   */
import java.util.*;
public class EmployeeSal
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Salary of employe :");
      Double Salary = sc.nextDouble();
      Double hra , DA,gross;
  
    if(Salary <= 10000)
	{
          hra = Salary * 0.20;
	  DA = Salary * 0.80;
           gross = Salary + hra + DA;
        System.out.println("The gross salary after Salary <= 10000 ::" +gross);
        }

    else if(Salary <= 20000)
	{
	hra=Salary*0.25;
	DA=Salary*0.90;
	gross = Salary + hra + DA ;
	System.out.println("The gross after the  Salary <= 20000 is  :: "+ gross);
	}

     else if(Salary > 20000)
	{
	hra= Salary * 0.30;
        DA =Salary *0.95;
	gross = Salary + hra +DA ; 
	System.out.println("The gross after the salary  Salary > 20000  ::" + gross);
	}
	else
	{
        System.out.print("invalid");
	}
  }
}
