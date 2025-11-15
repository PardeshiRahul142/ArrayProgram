/*8.Write program to input number and check number is Armstrong or not?*/

import java.util.Scanner;
public class AMNAPP
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number :");
    int num=sc.nextInt();
    int temp=num;
   
     int sum=0;
     int count=0;
    
      while(temp!=0)
       { count++;
         temp/=10;
       }
      temp=num;
      while(temp !=0)
      { int rem=temp%10;
        int p=1;
       for(int i=1;i<=count;i++)
       { p=p*rem;
       }
      sum+=p;
      temp/=10;
    }
    if(num==sum)
    { System.out.println("Number is armstrong");
    }
    else
    { System.out.println("Number is not armstrong ");
    }
  }
}