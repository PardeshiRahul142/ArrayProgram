/*Create a class Rectangle with length and breadth.

Requirements:
Method setDimensions() to input dimensions.

Method calculateArea() to return area.

Display area using an object.*/

import java.util.*;
class Rectangle
{
  int length;
  int breadth;
  
  public void calculateArea()
  {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the  length :");
	  length=sc.nextInt();
	  System.out.println("Enter the breadth :");
	  breadth=sc.nextInt();
  }
  public int displayArea()
  {
    return length*breadth;
  }
}
public class RectangleArea
{
  public static void main(String args[])
  {
  Rectangle rc=new Rectangle();
  rc.calculateArea(); 
  System.out.println("Area of rectangle is :"+rc.displayArea());
  }
 }
 
  
  