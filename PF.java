import java.util.*;
public class PF
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the CostPrice");
int CostPrice=sc.nextInt();
System.out.print("Enter the Selling price");
int SellingPrice=sc.nextInt();

if(CostPrice<SellingPrice)
{
System.out.print("The profit");
} 
else
{
System.out.print("the loss");
}
}
}
