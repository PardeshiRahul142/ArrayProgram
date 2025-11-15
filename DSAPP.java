/*Swapping last and first digit */

import java.util.*;
public class DSAPP
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int no ,temp,p1,last,first,p;
System.out.println("Enter the digit for swapping ");
no=sc.nextInt();

temp=no;
int count=0;
while(no !=0)
{
no = no/10;
 count++;                        //5
}

no=temp;                        
last= no%10;                    // 12345%10=5;
p=(int)Math.pow(10,--count);
first=no/p;                     

no =no%p;    //remove first digit 
no=no/10;    // remove last digit
last = last * p;   //5*10000 =50000
no = no*10;        //234 * 10= 2340       
no =last + first + no; //50000 +2340 +1 = 52341
System.out.print("after swap first and last digit is : "+no);



}
}
