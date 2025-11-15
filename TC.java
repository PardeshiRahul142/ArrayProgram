/*write a java program to get second from user and convrt into hours second and minutes*/
import java.util.*;
public class TC
{
public static void main(String argsP[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the second");
int InputSec=sc.nextInt();

int hours=InputSec/3600;

int min=(InputSec%3600)/60;

int sec=(InputSec%60);

System.out.println("The time in format : "+hours +" : "+ min+" : "+sec );
}
}
