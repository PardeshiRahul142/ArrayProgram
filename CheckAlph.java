// Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class CheckAlph
{ 
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
      System.out.print("Enter the alphabet");
       char ch= sc.nextLine().charAt(0);
        if(ch =='a' || ch =='e' || ch=='i'|| ch=='o' || ch=='u' || ch =='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		 {
		   System.out.print("The charactor is vowel  "+ ch);
		 }
		else
		 {
		   System.out.print("The charactor is consonant  "+ ch);
         }	
   }
}

	
		  
		