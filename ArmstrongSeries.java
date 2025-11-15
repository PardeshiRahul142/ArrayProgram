//armstrong number 
import java.util.*;
public class ArmstrongSeries
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number ");
  int n =sc.nextInt();

  for(int num=1;num<=n;num++)
  {
	     int sum=0;
	   int count=1;
	    int temp=num;
        while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
     		
	  temp=num;
	  while(temp!=0)
	{
		  
	  int rem=temp %10; 
	  int p=1;
      for(int k=1;k<count;k++) 
	  {
         p=p*rem;
	  }		 
	    sum = sum + p;
	    temp= temp /10;
	}
	  
    if(sum==num)
    {
      System.out.println(num);
    } 
  }
     
  }
}