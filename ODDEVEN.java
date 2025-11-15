/*Q5. Write a java program to print all odd numbers between 1 to 100*/

import java.util.*;
public class ODDEVEN
{ public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int od=0;
    int ev=0;
    for(int i=0;i<n;i++)
    {
       if(i % 2==0)
       { od=od+i;
       }
       else
       {  ev=ev+i;
       }
    }
    System.out.println("Sun of od number is :"+od);
    System.out.println("Sum of even number is :"+ev);
   
 
   }//main
}//class