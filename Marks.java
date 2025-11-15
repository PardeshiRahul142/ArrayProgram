/*	Q4. Write a java program to input marks of five subjects Physics, Chemistry, Biology, 
	    Mathematics and Computer, calculate percentage and grade according to given conditions:
		percentage >= 90% : Grade A
		percentage >= 80% : Grade B
		percentage >= 70% : Grade C
		percentage >= 60% : Grade D
		percentage >= 40% : Grade E
		percentage < 40% : Grade F   */

import java.util.*;
public class Marks
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the marks of five subject phy , che ,bio , math , computer :");
 
float phy = sc.nextFloat();
float bio = sc.nextFloat();
float chem= sc.nextFloat();
float math =sc.nextFloat();
float computer = sc.nextFloat();

 float marks= (phy + bio + math + chem + computer) / 5;

if(marks<=100 && marks>=90)
{
  System.out.println("Grade A ");
}

else if(marks<90 && marks>=80)
{
  System.out.println("Grade B");
}

else if(marks<80 && marks >=70)
{
  System.out.println("Grade C");
}

else if(marks<70 && marks >=60)
{
  System.out.println("Grade D");
}

else if(marks<60 && marks>=40)
{
  System.out.print("Grade E");
}

else{ 
  System.out.print("Grade F");
}

}
}