//Write a java program to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class characterCheck
{
 public static void main(String agrd[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the charactor :");
  char ch=sc.nextLine().charAt(0);
  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
    { 
	  System.out.print("The is alphabet");
    }
   else if(ch>='0' && ch<='9')
   {
   System.out.println("This is digit");
   }
   else
   {
   System.out.println("This is special charactor");
   }
  }
 }
 
