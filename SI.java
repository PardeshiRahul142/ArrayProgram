/*Q4. Write a java program to calculate the simple intrest. SI = P*R*T/100*/

import java.util.Scanner;
public class SI
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the principle");
int principle =sc.nextInt();

System.out.println("Enter the Rate ");
int rate = sc.nextInt();

System.out.println("Enter the time ");
int time = sc.nextInt();

int SI = principle * rate * time / 100 ;
System.out.print("The Simple intrest is :"+SI);
}
}

