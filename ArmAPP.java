import java.util.*;
public class ArmAPP
{
   public static void main(String args[])
   {
     int num=153;
     int temp=num;
     int count=0;
     int sum=0;
     
     while(num != 0)
     {
        num=num/10;
       count++;
     }//while
   
     temp=num;
      while(temp > 0)
      {
          int rem=temp%10; 
          int p=1;
          int j=1;
          while(j<=count)
          {
             p=p*rem;
            
             j++;
          }
         sum=sum+p;
         temp/=10;
      }
         System.out.println(num);
         String res=(sum==num) ?"Number is palindrome":"Number is not palindrome";
         System.out.println(res);
   }//main
}//class