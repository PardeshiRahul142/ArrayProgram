// Q52. Write a java program to display following series :
//         	2   729   4   512   6   343   8   216   10   125   12   64   14   27   16   8   18   1 

import java.util.*;
public class SeriesEvenCube{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number :");
   int n=sc.nextInt();
   int cube=9;
   for(int i=1; i<=n ; i++)
   {
     System.out.print(i*2+" ");
	 System.out.print(cube*cube*cube+" ");
	   cube--;
   }
  }
}