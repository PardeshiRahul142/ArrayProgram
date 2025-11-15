// MCQ test
public class MCQMax
{
  public static void main(String arga[])
  {
    int a[]={5,9,2,8};
    int max=a[0];
    for(int i=1;i<a.length;i++)
    {
     if(a[i]%2==0 && a[i]>max)
     {
	   max =a[i];
	 }
	System.out.println(max);
	}
  }
}
	