//power of number 
import java.util.*;
public class Power
{
  public static void main(String agrs[])
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the base and index:");
   int base=sc.nextInt();
   int index=sc.nextInt();
   int i=1,p=1;
   while(i <= index)
   {
   p=p*base;
      i++;
	}
	System.out.print("power of number "+p);
   }
   }