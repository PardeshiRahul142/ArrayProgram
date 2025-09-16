//Find leader

import java.util.*;
public class Leader
{  public static void main(String args[])
   {
      int a[]={ 15 , 18 , 5 , 7 , 9 , 2 };
     
      for(int i=0;i<a.length;i++)
      {
         boolean isLeader=true;
         for(int j=i+1;j<a.length;j++)
         {
           if(a[i]<a[j])
            {
               isLeader=false;
               break;
            }
	    else
	    {
		continue;
	     }
         }
         if(isLeader)
         { System.out.println(a[i]);
         }
      }
 
   }//main
}//class