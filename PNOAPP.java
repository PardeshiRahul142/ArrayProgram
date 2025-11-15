/*7.Write a program to input number and check number is palindrome or not?*/

import java.util.*;
public class PNOAPP
{ public static void main(String args[]) 
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number "); 
    int no=sc.nextInt();
    int temp=no;
    int rev=0;
   while(no !=0)
   { int rem=no%10;
     rev=rev*10+rem;
     no/=10;
   }
   if(temp==rev)
   { System.out.println("Number is palindrome");
   }
   else
   { System.out.println("Number is not palindrome");
   }
  }
}