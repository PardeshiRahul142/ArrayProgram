//Q9. Write a java program to print a multiplication table of any number.
import java.util.*;
public class TableOfNumber
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter the number:");
  int n=sc.nextInt();
  
  for(int i=1;i<=10;i++)
  {
    System.out.print(i*n);
   }
   
  }
}