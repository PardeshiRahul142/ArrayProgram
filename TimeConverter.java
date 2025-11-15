/*Write a Java program to convert seconds to hours, minutes and seconds.*/
import java.util.*;
public class TimeConverter
{
public static void main(String a[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the tine");
int second=sc.nextInt();

int hours=second/3600;

System.out.print("The time in HOURS "+hours);

//int b=second%3600;

//System.out.print(b);

int minute=(second%3600)/60;

System.out.print("The time in Minites "+minute);

int seconds =second%60;

System.out.print("the time in second  "+seconds);
}
}


