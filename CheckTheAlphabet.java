/*Write the program to check whether character is alphabet or not */

import java.util.Scanner;
public class CheckTheAlphabet
{
public static void main(String as[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the charactor or number");
String c=sc.next();
char ch=c.charAt(10);
if((ch>='a' && ch<='z') || (ch<='A' && ch>='Z'))
{
System.out.println("This is string"+ch);
}
else
{
System.out.println("This is not String ");
}
}
}