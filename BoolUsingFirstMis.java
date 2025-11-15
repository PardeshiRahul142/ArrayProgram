import java.util.*;
public class BoolUsingFirstMis
{   public static void main(String args[])
   {
      int a[]={10,5,3,4,3,5,6};
	  boolean visited[]=new boolean[1000];
	  for(int i=0;i<a.length;i++)
	     {
		     if(visited[a[i]])
			   {
					System.out.print("first  repeating element is :"+a[i]);
					return ;
			   }else{
			   visited[a[i]]=true;
			   }
		 }
		 System.out.println("No repeating element found .");
	}
}