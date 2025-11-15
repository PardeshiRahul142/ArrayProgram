/*There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.
*/

import java.util.*;
public class Cource
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the NN , MM , KK");
int NN= sc.nextInt();
int MM=sc.nextInt();
int KK=sc.nextInt();
int Nk = NN+KK;

if(MM > KK && MM>=Nk)
{
System.out.print("Yes:");
}
else if(MM == KK)
{
System.out.println("NO");
}
else
{
System.out.println("NO");
}

}
}