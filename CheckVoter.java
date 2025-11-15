/*Q5. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.*/


import java.util.Scanner;
public class CheckVoter
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the age :");
int age = sc.nextInt();

if(age>18)
{
System.out.print("Vote:");
}
else
{
System.out.print("not eligible");
}

}
}