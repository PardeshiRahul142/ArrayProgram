//WAP to find max average of sub arra
import java.util.*;
public class SubArrayMax
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={1,12,-5,-6,50,3};
int k=4;
int sum=0;
for(int i=0;i<k;i++)
{
  sum =sum+a[i];
}
  int max=sum;
 for(int i=k;i<(a.length);i++)
 {
   sum=sum+a[i]-a[i - k];
   if(sum > max)
   {
   max=sum;
   }
 }
 float avg =((float)max)/4;
 System.out.println("Max number is :"+avg);
 }
 }
   