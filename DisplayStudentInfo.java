/*Objective: Create a class Student with fields: rollNo, name, marks.

Requirements:
Create a method setData() to assign values.

Create a method displayData() to print values.

Create 2 objects and display their data.
*/

import java.util.*;
class  DisplayStu
{
	public int rollNo;
	String name;
	int marks;
	
   public void SetData()
   {  
   Scanner sc=new Scanner(System.in);
    
	 System.out.println("Enter the roll No :");
	 rollNo=sc.nextInt();
	 sc.nextLine();
	 
	 System.out.println("Enter the name :");
	 name=sc.nextLine();
	
	
	System.out.println("Enter the marks :");
	 marks=sc.nextInt();
	
	}
	void DisplayData()
	{
	   System.out.println("Rollno is "+rollNo);
	   System.out.println("Name is :"+name);
	   System.out.println("marks is :"+marks);
	   
	}
}
public class DisplayStudentInfo{
  public static void main(String args[])
  {
         DisplayStu Sd = new DisplayStu();
         DisplayStu Sd1 = new DisplayStu();
		 
		 System.out.println("Enter the first student data :");
		 Sd.SetData();
		 
		 System.out.println("Enter the second student data :");
		 Sd1.SetData();
		 
		 System.out.println("First student data is :");
		 Sd.DisplayData();
		 
		 System.out.println("Second student data is :");
		 Sd.DisplayData();
  }
}
   
	 
	