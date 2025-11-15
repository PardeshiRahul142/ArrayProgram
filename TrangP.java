//pattern
/*
A
AB
ABC
ABCD
ABCDE
ABCDEF
ABCDEFG
*/
public class TrangP{
 public static void main(String args[]){
	 
  for(int i=1;i<=7;i++)
   {
     for(int j=1;j<=7;j++)
	  {
		  if(j<=i)
	      System.out.print((char)(j + 64));
      }
	  System.out.println(" ");
   }
 }
 }