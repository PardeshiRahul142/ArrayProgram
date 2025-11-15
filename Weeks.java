/*Write a C program to input week number(1-7) and print day of week name using switch case. C program to find week day name using switch case. How to find day name of week using switch case in C programming.
*/

import java.util.*;
public class Weeks
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter your choics  :");
int ch = sc.nextInt();

switch(ch)
{
     
        
case 1: 
        System.out.print("Monday");
        break;

case 2: 
         System.out.print("Tuesday");
        break;
case 3: 
        System.out.print("Wednsday");
 	break;
case 4: 
       System.out.print("Thousday"); 
	break;

case 5: 
        System.out.print("Friday");
         break;

case 6: 
         System.out.print("Saturday");
          break;

case 7:
      System.out.print("Sunday");
        break;
default:
          System.out.print("Choice miss match:");
}
}
}
        
     