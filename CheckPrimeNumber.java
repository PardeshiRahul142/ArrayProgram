//Write a java program to check Number Is Prime Number or Not.

import java.util.*;
public class CheckPrimeNumber
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int n = sc.nextInt();
  boolean prime=true;

        if (n <= 1) {
            prime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break; // no need to check further
                }
            }
        }

if(prime)
{System.out.println("Prime number");
}
else
{System.out.println("Not prime");
}
}
}


	