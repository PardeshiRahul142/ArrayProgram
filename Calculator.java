/* Create a class Calculator with two integers a and b.

Requirements:
Method setValues() to assign numbers.

Methods: add(), subtract(), multiply(), and divide().*/

import java.util.*;
class Cal
{
  int  a;
  int b;
  
    public void setValues()
    {
     Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter the a :");
	 a=sc.nextInt();
	 System.out.println("Enter the b :");
	 b=sc.nextInt();
    }
   
    int add()
	{
	  return a+b;
	}
	
	int subtract()
	{
	  return a-b;
	}
	int multiply()
	{
	  return a*b;
	}
	int divide()
	{
	  return a/b;
	}
}
public class Calculator
{
  public static void main(String args[])
  {
     Cal cal=new Cal();
	 cal.setValues();
     System.out.println(" add :"+cal.add());
	 System.out.println("Subtraction :"+cal.subtract());
	 System.out.println("multiply :"+cal.multiply());
	 System.out.println("divide :"+cal.divide());
  }
}