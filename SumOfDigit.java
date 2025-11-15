
import java.util.*;
public class SumOfDigit
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the digit");
int num=sc.nextInt();

int sum=0;
while(num>0){
int rem=num%10; 
num = num /10;
sum = sum+rem;  
}
  System.out.println(sum);
}
}
