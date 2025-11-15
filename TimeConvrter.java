/*write a java program to get second from user and convrt into hours second and minutes*/
import java.util.*;
public class TimeConvrter1
{
public static void main(String argsP[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the second");
int InputSec=sc.nextInt();

int hours=InputSec/3600;

System.out.println(hours);
}
}
