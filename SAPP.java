import java.util.*;
class Sum
{  public void sum(String name,int ...x)
     { 
       int agg=0;
       for(int i=0;i<x.length;i++)
       { agg=agg+x[i];
       }
       int per=agg/x.length;
       System.out.println("Percentage is :"+per);
     }
}
public class SAPP
{ public static void main(String args[])
  { Sum s=new Sum();
        s.sum("Rahul",50,50,50,50);
  }
}