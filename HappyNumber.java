//happy number
import java.util.*;
public class HappyNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
int temp=num;
 while(temp!=1 && temp!=4){
	 int sum=0;
	while(temp > 0)
	{
       int rem= temp % 10;
       sum = sum + rem * rem;
       temp = temp / 10;
    }
	temp=sum;
}
if(temp==1)
{
	System.out.println("Happy Number");
}else{
	System.out.println("Not Happy Number");
}

}
}