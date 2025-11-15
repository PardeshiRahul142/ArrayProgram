//MCQ 4
public class Mcq4
{
    public static void main(String args[])
	{
	  int []arr={2,4,6,8};
	  int sum=0;
	  for(int i=0;i<arr.length;i++)
	  {
	    sum+=arr[i]*(i%2);
	  }
	  System.out.println(sum);
	  }
}