//Q8. Write a java program to display only non-zero values from an array.
import java.util.*;
public class ZeroDigitElement{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[]={10,30,2,4,302};
	int i;
	
	System.out.println("Given array is :");
	for(i=0;i<a.length;i++)
	{
	  System.out.println(""+a[i]);
	}
	
	for(i=0;i<a.length;i++)
	{
		int num = a[i];
		boolean isZero=false;
		while(num > 0)
		{
	      int rem= num %10;
	      if(rem== 0)
	      {
		     isZero=true;
	         break;
	      }
	       num=num/10;
		  }
	
	if(!isZero)
	{
		System.out.println(a[i]);
	}
	}
  }
}