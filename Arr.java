import java.util.*;
public class Arr
{   public static void main(String args[])
    {
     int a[]={1,2,3,4,5};
     
     for(int i=0;i<3;i++)
     {
         int ind=a[0];
        for(int j=0;j<a.length-1;j++)
        {  a[j]=a[j+1];
        }
        a[a.length-1]=ind;
     }
      //{4,5,1,2,3}; {4,5,3,1,2}
     for(int i=2;i<4;i++)
     {
       int val=a[2];
        for(int j=2;j<a.length-1;j++)
       { a[j]=a[j+1];
       }
        a[a.length-1]=val;
     }
     
     for(int s=0;s<a.length;s++)
     {   System.out.println(a[s]);
     }	
   
     }
}//class