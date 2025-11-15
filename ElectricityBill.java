/*Write a C program to input electricity unit charge and calculate the total electricity bill according to the given condition:
 For first 50 units Rs. 0.50/unit
 For next 100 units Rs. 0.75/unit
 For next 100 units Rs. 1.20/unit
 For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.
How to calculate electricity bill using if else in C programming. Program to find electricity bill using if else in C. Logic to find net electricity bill in C program.
*/
import java.util.*;
public class ElectricityBill
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the units of lites ");
Double units=sc.nextDouble();
Double unitsBill;
Double charge;
if(units<=50)
{
 unitsBill=50 * 0.50 ;
}
else if(units<=150)
{ 
  unitsBill=50*0.50+ 100 * 0.75;
}
else if(units<=250)
{  
   unitsBill= 50 * 0.50 + 100 * 0.75 + 100 * 1.20; 
}
else
{
 unitsBill= 50 * 0.50 + 100 * 0.75 + 100 * 1.20 +(units * 1.50); 
}
 
charge = unitsBill * 20 /100;
Double TotalBill = charge + unitsBill ; 

System.out.print("The Electricity bill is : "+TotalBill);
}
}