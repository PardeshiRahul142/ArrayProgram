//Write a java program to print all ASCII characters with their values.
import java.util.*;
public class ASCIIValuePrint
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  char ch=sc.nextLine().charAt(0);
  int ASVal=ch;
  System.out.println("The ASCII value of : " + ch +"  is "+ ASVal);
  }
  }