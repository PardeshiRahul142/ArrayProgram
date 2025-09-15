//Write a program of nth Strong number :

import java.util.*;

public class NthFact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { 
            int num = i;
            int orig= num; 
            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                int f = 1;
                int j = 1;
                while (j <= rem) {
                    f = f * j;
                    j++;
                }
                sum = sum + f;
                num = num / 10;
            }

            if (sum == orig) { 
                System.out.println("Strong number is"+i);
            } else {
                System.out.println("number is not strong "+i);
            }
        }
    }
}
