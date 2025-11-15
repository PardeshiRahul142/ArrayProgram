// Q52. Write a java program to display following series :
     //      	2   729   4   512   6   8   216   10   125   12   64   14   27   16   8   18   1 	
import java.util.*;
public class Series1{
  public static void main(String args[]){
       	 Scanner sc=new Scanner(System.in);
       int cube=9;
       int even=2;
  
for(int i=0;i<=18;i++)
{
 if(i% 2==0)
{
 System.out.print(even+ " ");
   even+=2;
}
else
{
  int ans=cube*cube*cube;
 System.out.print(ans+" ");
    cube--;
}
}
}//main close
}//class close