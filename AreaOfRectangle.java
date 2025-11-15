/*. Write a java program to enter length and breadth of a rectangle and find its area.*/


import java.util.*;
public class AreaOfRectangle{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of ractange :");
		int length=sc.nextInt();
		System.out.println("Enter the breadth of a rectangle :");
		int breadth=sc.nextInt();
                int area=length*breadth;
		System.out.println("The area of Rectagle is "+area);
}
}
