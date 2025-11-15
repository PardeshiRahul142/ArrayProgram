public class RotateEle
{
  public static void main(String args[])
 { 
   int a[]={10,03,40,3040,50};
   int ind=2;
   int value=200;
 for(int i=0;i<ind;i++)
{
  int temp=a[0];
for(int j=0 ;j<a.length-1;j++)
{
  a[j]=a[j+1];
}
a[a.length-1]=temp;
}
System.out.println("after rotate arrat");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
