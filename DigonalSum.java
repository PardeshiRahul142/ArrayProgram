import java.util.*;
public class DigonalSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][3];
	System.out.println("Enter the element in array ");
	for(int i=0;i<a.length;i++)
	{
	 for(int j=0;j<a.length;j++)
	 {
	   a[i][j]=sc.nextInt();
	 }
	}
	int rsum=0,lsum=0;
	System.out.println("Display :");
	for(int i=0;i<a.length;i++)
	{
	  for(int j=0;j<a.length;j++)
	  {
	    if(i==j)
		{
		   lsum=lsum+a[i][j];
		}
		if(j==2-i)
		{
		   rsum=rsum+a[i][j];
		}
		System.out.print(a[i][j]);
	  }
	  System.out.println();
	}
	System.out.println("lsum "+lsum);
	System.out.println("rsum "+rsum);
	
}
}