package Arr.gth;
class VariableArg
{   int s;
	void sum(int ...x)
	{  for(int i=0;i<x.length;i++)
	   {   s=s+x[i];
	   }
	System.out.println("Sum is "+s);
	}
}
public class VarArg 
{    public static void main(String[] args) 
     {   VariableArg v=new VariableArg();
		 v.sum(10,23,30,49,49,66,3,4,35,45,34,5,64,45);
	}
}
