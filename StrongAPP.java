import java.util.*;
public class StrongAPP
{  public static void main(String args[])
   {
 
       int num=145;
       int temp=num;
       int sum=0;
       while(num!=0)
       {
          int rem=num%10;
          int f=1;
          for(int i=1;i<=rem;i++)
          { 
            f=f*i;
          }
          sum+=f;
          num/=10;
       }
        String res=(sum==temp) ? "Strong NO" : " Not strong number ";
        System.out.println(res);
   }//main
}//class