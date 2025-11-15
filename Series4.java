//54. Write a java program to display following series :
//        	1  2  4  7  11  16  22  29  37  46.
import java.util.*;
public class Series4{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int gap=1;  
      int current=1;
	  System.out.print(current+" ");
   for(int i=1;i<=10;i++)
      {
		
	   current = current + gap;
	   System.out.print(current+"  ");
	    gap++;
	   
	  }
  }
}