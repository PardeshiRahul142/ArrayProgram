/*Assigmrnt first  :  The chef has to travel to another place. For this, he can avail any one of two cab services.*/

import java.util.*;
public class AssigmentFirst
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int T =sc.nextInt();

for(int i=0; i<=T ; i++){
System.out.print("Enter the cab price");
int x=sc.nextInt();
int y=sc.nextInt();

if(x < y)
{
   System.out.println( x +"  "+ y +"     First   ");
}
else if(x == y)
{
   System.out.println( x +"  "+ y +"      Any    ");
}
else if(x > y)
{
  System.out.println( x  +"  "+ y +"       Second  "); 
}
}
} 
}

