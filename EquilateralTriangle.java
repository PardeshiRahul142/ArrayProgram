/*Write a java program to calculate area of an equilateral triangle. Area = (√3 / 4) * side^2*/
import java.util.*;
public class EquilateralTriangle
{
public static void main(String P[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the side of trangle");
double side=sc.nextDouble();
double Area = (Math.sqrt(3) /4)*side*side;
System.out.print("the Equilateral of Triangle is "+Area);

}
} 