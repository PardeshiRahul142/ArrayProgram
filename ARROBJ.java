class AVGMarks
{
  public void sum(int ...x)
  {
    int sum=0;
    int count=0;
    for(int i=0;i<x.length;i++)
    {
        sum+=x[i];
       count++;
    }
    int avg=sum/count;
    System.out.println("AVG is :"+avg);
  }
}
public class ARROBJ
{
  public static void main(String args[])
  {
    int a[]={10,20,30,40,50};

     AVGMarks am=new AVGMarks();
       am.sum(a);
  }
}