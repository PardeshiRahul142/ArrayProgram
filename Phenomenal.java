public class Phenomenal{
public static void main(String args[]){
  for(int i=1;i<=3;i++)
  {
   for(int j=1;j<=11;j++)
   {
    if(i==1)
	{
	     if(j==3  || j==7 || j==11)
		 {
		    System.out.print("*");
		 }
		 else
		 {
		    System.out.print(" ");
		 }
	}
    else if(i==2)
	{
	    if(j % 2==0)
	    {
	       System.out.print("*");
	    }
		else
		{
		   System.out.print(" ");
		}
	}
	else if(i==3)
	{
	    if(j==1 || j==5 ||j==9)
		{
		   System.out.print("*");
		}
		else
		{
		   System.out.print(" ");
		}
	}
	else
	{
	    System.out.print(" ");
	}
	}
	System.out.println();
}
}
}
	