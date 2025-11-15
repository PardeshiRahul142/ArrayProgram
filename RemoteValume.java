/*The chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. The chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
*/

import java.util.*;
public class RemoteValume
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the XX and YY  ");

int XX=sc.nextInt();
int YY=sc.nextInt();
int output;
if(XX <=YY)
 {
   output = YY-XX;
 }
else
{
   output=XX-YY;
}
System.out.print(output);

}
}

  
