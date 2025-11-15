/*WAJP to input number from key word and remove the alst digit from number*/

import java.util.*;
public class RemoveLastDigit
{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
 num = num/10;

System.out.println("digit is " +num);
}
}
