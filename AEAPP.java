import java.util.*;
public class AEAPP
{ public static void main(String args[])
  {
    int a[]={1,2,3,4,5,3,5,3};
    int pos=3;
    int val=90;
    for(int i=a.length-1;i>pos-1 ;i--)
    {  a[i]=a[i-1];
    }
     a[pos]=val;
    for(int i=0;i<a.length;i++)
    {  System.out.println(" "+a[i]);
    }
  }
}