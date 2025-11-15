/*Ezio can manipulate at most XX number of guards with the apple of Eden.
Given that there are YY number of guards, predict if he can safely manipulate all of them.
*/

import java.util.*;
public class Mainpulation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int TT = sc.nextInt();

for(int i=0;i<TT;i++)
{

System.out.println("Enter the XX guards :");
int XX=sc.nextInt();

System.out.print("Enter the YY guards :");
int YY = sc.nextInt();

if(XX >= YY || XX == YY)
{
System.out.println("  Yes  ");
}
else
{
System.out.println("  No  ");
}
}
}
} 