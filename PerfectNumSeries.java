//Write a java program to display 1 to nth Perfect Number.
import java.util.*;
public class PerfectNumSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
			{    
		         int j;
			    int sum=0;
			    for(j=1 ; j<=i/2;j++)
					{
					   if( i % j == 0)
							{
								sum=sum+j;
							}
					}
			if(sum == i)
				{
					System.out.println(i);
				}
			}
	}
}