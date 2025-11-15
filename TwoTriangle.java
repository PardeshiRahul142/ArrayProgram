/* 
      *
	  **
	  ***
	  ****
	  *****
	  ****
	  ***
	  **
	  *     */
	
public class TwoTriangle
{
  public static void main(String args[])
  {
  for(int i=1;i<=9;i++)
  {
  for(int j=1;j<=5;j++)
  {
  String str=((i>=j&&i<=5)||(j<=10-i && i>5)) ?"*" : " ";
  System.out.print(str);
  }
  System.out.println();
  }
  }
  }