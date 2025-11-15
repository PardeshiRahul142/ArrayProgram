/* Write a Java program to print the ASCII value of a given character.*/
import java.util.*;
public class ASCII{
public static void main(String p[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the charactor");
char ch=sc.next().charAt(0);
int ASCIIValue=ch;
System.out.println("The ascii value of "+ ch +" is "+ASCIIValue);
}
}
