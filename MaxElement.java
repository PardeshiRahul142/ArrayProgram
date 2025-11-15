import java.util.*;
public class MaxElement{
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a[][]=new int[3][3];
  System.out.println("Enter the element in array: ");
  for(int i=0;i<a.length;i++)
  {
    for(int j=0;j<a.length;j++)
	{
	 a[i][j]=sc.nextInt();
	}
   }
   System.out.println("Enter the number ");
   for(int i=0,count=0;i<a.length;i++)
   {
     int max=a[i][count];
	 System.out.println(count);
	 for(int j=0;j<a[i].length;j++)
	 {
		 
	   if(a[i][j]>max)
	   {
	       max=a[i][j];
	   }
	   
	 }
	  System.out.println(""+(i+1)+" max number is : "+max);
	    count=0;
	
   }
   }
   }
   