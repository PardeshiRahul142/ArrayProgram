/*Monkey problem*/

import java.util.*;
public class Monkey
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of monkey  :");
int n = sc.nextInt();

System.out.println("Enter the number of banna eatable banna by single monkey : ");
int NoBE = sc.nextInt();

System.out.println("Enter the number of peanuts eatable by single monkey  : ");
int NoPE = sc.nextInt();

System.out.print("Enter the number of banna : ");
int Banna = sc.nextInt();

System.out.println("Enter the number of peanuts: ");
int Peanut = sc.nextInt();
 

if(Banna >= NoBE || Peanut >= NoPE)
{

  int BannaServ = Banna / NoBE;
  int PeanutServ =Peanut / NoPE;

  int totalMonkeyEatBP = BannaServ + PeanutServ ;
  System.out.println("The total number of banna and peanut is "+totalMonkeyEatBP);

   int leftMonkey = n-totalMonkeyEatBP;

   System.out.println("Number of monkey left from banna and peanuts : "+leftMonkey);

}
else
{
 System.out.println("invalid input:");
}

}
}
   