/* Write a java program swap two number using third variable.*/

import java.util.*;
public class SwapNumUsingThridVar
{
public static void main(String x[])
{
int a=10,b=20;
System.out.println("before swapping number a :"+ a +"number b:"+ b);

int temp=a;
    a=b;
    b=temp;
System.out.println("after swapping number a :"+ a +"number b:"+ b);
}
}