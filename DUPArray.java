import java.util.*;
public class DUPArray
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int a[]={1,3,2,3,4,5,8,6};
	 int size=a.length;
	int j=0,i=0,k=0;
	 System.out.println("After removing deuplicate value :");
	for( i=0;i<size-1;i++)
	   {
		  for( j=i+1;j<size;j++)
		     {
			     if(a[i]==a[j])
				 {
				    for( k=j;k<size-1;k++)
					    {
						   a[k]=a[k+1];
						}
						j--;
						size--;
				 } 
				 
			 }
		}	
			  for( i=0;i<size;i++)
			     {
					 System.out.print(a[i]);
				 }
	}	  
}