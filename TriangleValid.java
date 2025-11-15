/*Write a java program to check whether triangle is valid or not.*/
import java.util.*;
public class TriangleValid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the three side of triangle");
int side1=sc.nextInt();
int side2=sc.nextInt();
int side3=sc.nextInt();

int total = side1+side2+side3;

if(total == 180)
{
System.out.print("Thetriangle is valid");
}
else{
System.out.print("The triangle is not valid");
}
}
}