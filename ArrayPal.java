/*Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
	Output: true*/
import java.util.*;
public class ArrayPal
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	int a[]={1,2,3,2,1};
    System.out.println("Check the array is palindrome :");
	boolean flag =false;
	
      for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                flag = false;
                break;
            }
        }
	if(flag)
	  {
		  System.out.print("true");
	  }
	else
	  {
		System.out.print("true");
	  }
}
}
	
	  
	  
	  