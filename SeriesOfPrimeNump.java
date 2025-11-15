//prime number 
import java.util.*;
public class SeriesOfPrimeNump{
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		 int n=sc.nextInt();
		 
		
		for(int p=2 ; p<=n;p++)
			{
				boolean isPrime=true;
			    for(int i=2 ;i<=p/2;i++)
					{
						if(p%i==0)
							{
							    isPrime=false;
								break;
							}
					}
				if(isPrime)
				{
					System.out.println(p);
				}
			}
    }
}
			