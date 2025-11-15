import java.util.*;
public class DemoArmSeries{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =sc.nextInt();
		for(int i=0;i<=num;i++)
			{
				int count=0;
				int sum=0;
				int temp=i;
			    while(temp > 0)
					{
						count++;
						temp /=10;
					}
					
				temp=i;
				while(temp > 0)
					{
						int rem = temp % 10;
						int p=1;
						for(int j=0 ; j<count;j++)
							{
								p*=rem;
							}
							sum+=p;
							temp/=10;
					}
				if(sum==i)
					{
						System.out.println(i+"");
					}
			}
	}
}