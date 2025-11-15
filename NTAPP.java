/*4.Write a program to input number and print its table?*/

import java.util.*;
public class NTAPP
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);

    System.out.println("Enter number"); 
    int no=sc.nextInt();

    for(int i=1;i<=10;i++)
    { System.out.println(no*i);
    }
  }

}//class