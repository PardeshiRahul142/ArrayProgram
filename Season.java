/*Q4. Check whether the month number is valid and display season.

    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.*/

import java.util.*;
public class Season
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int season = sc.nextInt();

if(season >= 3 && season <= 5)
{
 System.out.print("Spring");
}
else if(season >=6 && season <= 8)
{ System.out.print("Summer");
}
else if(season >=9 && season <=11 )
{
System.out.print("Automn");
}
else if(season == 12 || season ==1 || season ==2)
{
System.out.print("Winter");
}
else
{
 System.out.print("in valid input");
}

}
}