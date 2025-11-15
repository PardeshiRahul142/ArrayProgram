//Duplicate element
public class DuplicateElement{
  public static void main(String args[]){
  int a[]={1,3,1,3,4};
  int b[]=new int[a.length];
  int k=0;
  for(int i=0;i<a.length;i++)
   {
     boolean isFound=false;
	 for(int j=0;j<b.length;j++)
	 {
	   if(a[i] == b[j])
	     {
		  isFound=true;
		   break;
		  }
	  }
	  if(isFound=false)
	  {
	  b[k]=a[i];
	   break;
	  }
	  }
	  System.out.println("The duplicate array ");
	  for(int i=0;i<b.length;i++)
	    {
		 System.out.println("  "+b[i]);
		}
	}
}