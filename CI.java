/*Q4. Write a java program to calculate the compount intrest.*/

import java.util.*;
public class CI
{
public static void main(String agrs[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Principle\n rate\n time\n");
double p=sc.nextDouble();
Double r=sc.nextDouble();
Double t=sc.nextDouble();
double amount = p * Math.pow((1 + r/100),t);
/*double amount = p * Math.pow((1 + r / 100), t);*/
double CI = amount-p;
System.out.print("The amount is  \t:"+amount);
System.out.print("The Compound intrest is \t"+CI);
}
}
