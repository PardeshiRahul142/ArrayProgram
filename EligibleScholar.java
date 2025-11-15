/*Check whether a student is eligible for scholarship:

    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.*/

import java.util.*;
public class EligibleScholar
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the attendance in % ");
int attendance=sc.nextInt();
System.out.print("Enter the marks :");
int marks= sc.nextInt();

if(marks >= 80 && attendance>=75)
{ System.out.print("Eligible for scholarship");
}
else
{
System.out.print("Not eligible for scholarship");
}

}
}