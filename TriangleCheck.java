import java.util.*;
public class TriangleCheck
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the three side of triangle");
int side1=sc.nextInt();
int side2=sc.nextInt();
int side3=sc.nextInt();

if(side1==side2 && side1==side3)
{
System.out.print("The triangle is equilateral");
}
else if(side1==side2 || side2==side3 || side3==side1)
{
System.out.println("The triangle is isoscale");
} 
else{
System.out.println("The triangle is Scalene");
}
}
}

