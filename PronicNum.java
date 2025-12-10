/*a Java program to print all Pronic numbers between 1 and n.*/

import java.util.*;
public class PronicNum
{
  public static void main(String args[])
  {
    
    Scanner sc=new Scanner(System.in);
    int result=0;
    System.out.println("Enter the num");
    int no=sc.nextInt();
    int num=2;
    for (int i = 1; i * (i + 1) <= no; i++) {
            int pronic = i * (i + 1);
            System.out.println(pronic);
        }    

  }
}