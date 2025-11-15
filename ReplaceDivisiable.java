/*Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]
*/
import java.util.*;
public class ReplaceDivisiable{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int a[]={3,6,7,9,10};

   for(int i=0;i<a.length;i++)
   {
     if(a[i] % 3 == 0 )
	    {
		    a[i]=-1;
		}
    }
   System.out.println("After replacing array :");
   for(int i=0;i<a.length;i++)
   {
     System.out.println(a[i]);
	}
}
}
		