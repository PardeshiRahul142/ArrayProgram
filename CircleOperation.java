/*Write a java program to enter radius of a circle and find its diameter,area and circumference.
	 Formula :-
						diameter=2 * radius;
						circumference = 2 * 3.14 * radius;
						area = 3.14 * radius * radius;

*/

import java.util.*;
public class CircleOperation{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the radius of circle");
	float radius = sc.nextFloat();

        float diameter = 2*radius;
	System.out.println("The diameter of circle is :"+diameter);

        float circumference= 2 * 3.14f * radius;
	System.out.println("The  circumference is :"+circumference);

	Float area= 3.14f * radius * radius;
	System.out.println("The area of circle is "+area);
}
} 
