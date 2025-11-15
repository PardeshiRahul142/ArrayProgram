/*A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ 
competition.
You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.
*/

import java.util.*;
public class MisicalInstrument
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the current IQ: ");
int Cur_IQ=sc.nextInt();

if(Cur_IQ + 7 >=170)
{
System.out.print("YES");
}
else
{
System.out.println("NO");
}

}
}