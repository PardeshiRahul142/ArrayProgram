import java.util.*;
public class AlphaPat{
  public static void main(String args[])
  {
    for(int i=1;i<=5;i++)
	{ char n='A';
	 for(int j=1;j<i*2;j++)
	 {
	   if(i>j)
	   {
	   System.out.print(n+" ");
	        n++;
	   }
	   else
	   {
		   System.out.print(n+" ");
		   n--;
	   }
	  
	 }
	 System.out.println();
	}
  }
}
	 
	   