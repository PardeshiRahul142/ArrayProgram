import java.util.*;
public class FuncationFact{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the base :");
  int b=sc.nextInt();
  System.out.println("Enter the index :");
  int ind=sc.nextInt();
   int res= power(b,ind);
   System.out.println(res);
  
}
public static int power(int base , int index)
{
  int p=1;
  for(int i=1;i<=index;i++)
  {
    p=p*base;
  }
   return p;
    
}
}