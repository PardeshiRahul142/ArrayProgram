/*Q4. Write a program to reverse a number using a while loop.*/
import java.util.*;
public class RevNo
{ public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int no=sc.nextInt();
    int rev=0;
    while(no>0)
    {  int rem=no%10;
       rev=rev*10+rem;
       no=no/10;
    }//while
   System.out.println("Reverse numver is :"+rev);
  }//main
}//class