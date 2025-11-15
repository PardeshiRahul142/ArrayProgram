//duck number 
import java.util.*;
public class DuckSeries
{
public static void main(String args[])
{ 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  int num=sc.nextInt();

   
  for(int i=1;i<=num ; i++)
  {
	  int temp = i;
	  int isDuck=0;

    while(temp > 0)
	{
	  int rem = temp %10; 
	  
	  if(rem==0)
	   {
	    isDuck=1;
		break;
	 }
	  temp=temp/10;
	}
	
	if(isDuck==1)
	{
	System.out.println(i);
	}
  }
}
}