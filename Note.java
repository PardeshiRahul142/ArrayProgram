// Write the program to find the total number of notes in given number amount is = 2528

import java.util.*;
public class Note
{
public static void main(String args[])
{
   int amount =3503;

   int notes=500;
   int counts;


while(amount>0)
{
  if(amount >=notes)
   {
      counts=amount /notes;
      System.out.println(counts + " X " +notes + " = " + (notes * counts));
      amount %=notes;
   }else
   {
       System.out.println(notes +" Zero notes");
   }

   if(notes==500)
   {
      notes=100;
   }else if(notes==100)
   {
       notes=50;
   }
    else if (notes==50)
   {
      notes =20;
   }
    else if(notes == 20)
   { 
     notes =10;
	
   }
   else if(notes == 10)
   { 
     notes =5;
	
   }
       else if(notes == 5)
   { 
     notes =2;
	
   }else if(notes==2)
   {
      notes=1;
   }else if(notes==1)
   {
       notes=0;
   }else
   {
    
       break;
   }
      


}
}
}
