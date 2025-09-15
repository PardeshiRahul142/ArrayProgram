import java.util.Scanner;

public class NeonNum 
 {
    static int sumOfDigits(int n) 
    {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int sum = sumOfDigits(square);

        if (sum == num)
        {
            System.out.println("Neon Number is "+num);
        }
        else
         {
            System.out.println("Number is not neon"+num);
         }
     }//main
}//class 
