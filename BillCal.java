/* write the java program to get the qty and rate from user if bill are greater 10000 then discount 20% and otherwise 10% discount */

import java.util.*;
public class BillCal
{
public static void main(String agrs[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the qty and rate of product  :");
int qty=sc.nextInt();
int rate=sc.nextInt();
int total= qty * rate;

System.out.println("Before discount bill is : " + total); 

if(total >= 10000)
{
  total = total -((total * 20)/100);
}
else
{
  total = total -((total * 10)/100);
}
System.out.print("After discount bill is  :" +total);
}
}