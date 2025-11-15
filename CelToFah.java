/*	Q3. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
	
	Formula :-  
	 fah = (cel * 9 / 5) + 32;
	
*/

import java.util.*;
public class CelToFah
{
public static void main(String argds[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the temperature in Celsius ");
float CelTemp = sc.nextFloat();

float FahTemp = ((CelTemp * 9/5)+32 );

System.out.print("The temperature in Fahrenheit"+FahTemp);
}
} 
