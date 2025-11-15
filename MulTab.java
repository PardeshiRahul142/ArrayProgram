/*Q3. Write a program to display multiplication table of a number entered by the user.
*/

import java.util.*;
public class MulTab
{ public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number :");
     int n=sc.nextInt();
     int i=1;
     int table=0;
     while(i<=10)
     { table=i*n; 
      System.out.println(table);
       i++;
     }
    
  }//main
}