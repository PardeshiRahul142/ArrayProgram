/*	Q2. Write a java program to enter temperature in Fahrenheit and convert to Celsius.	*/

import java.util.*;
public class TempConverter
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter the temperature in Fahrenhit :");

float FTemp = sc.nextFloat();
float cel = (FTemp-32)* 5 / 9;

System.out.println("The temperature in Celsius is :"+cel+"°C");
}
}