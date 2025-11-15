/*2.Write program to input number using Scanner class and reverse it?*/
import java.util.*;
public class ScanRev
{ public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int no=sc.nextInt();
 
   System.out.println("before reverse number"+no);
   int rev=0;
  while(no !=0) 
  { int rem=no%10;
    rev=rev*10+rem;
    no=no/10;
  }
  System.out.println("After reverse number  is:"+rev);
 
  }


}//class