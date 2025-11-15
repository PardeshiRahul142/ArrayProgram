/* cab program of chef */

import java.util.*;
public class Cab
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two cab and its price: ");

int XX=sc.nextInt();
int YY=sc.nextInt();

if(XX < YY)
{
System.out.println("First");
}
else if(XX == YY)
{
System.out.println("any");
}
else
{
System.out.println("Second");
}

}
}