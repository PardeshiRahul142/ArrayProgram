// Q55. Write a java program to display following series :
//          	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
public class TwoTable{
  public static void main(String args[])
  {
  int num1=3;
  int num2=5;
  for(int i=1;i<=20;i++)
  {
    //System.out.print(i*5 +" "+i*3 +" ");
	if(i%2 !=0)
	{
	  System.out.print(num2+" ");
	     num2+=5;
	}
	else
	{
		System.out.print(num1 + " ");
		num1+=3;
	}
  }
  }
}