/*An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
*/

import java.util.*;
public class TF
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Two wheeler and four wheeler  :");
int V=sc.nextInt();                                                      // V means number of 2 and 4 wheeler 200
System.out.println("Enter the wheeles :");
int  W= sc.nextInt();                                                     //W means wheels  500

int FV = (W - 2 * V)/2 ;
int TW =V-FV;
System.out.print("the four wheeler :"+FV);
System.out.print("The two wheeler is :"+TW);

}
}