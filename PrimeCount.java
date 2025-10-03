/*2. Count the number of prime numbers in an array.
• Input: arr = [2, 5, 6, 9, 11]
• Output: Count of prime numbers = 3
• Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such
elements*/

class PrimeCount
{ public static void main(String args[])
  {
    int a[]={1,2,5,6,9,11};
    int count=0;
          boolean flag=true;

    for(int i=0;i<a.length;i++)
    {
      for(int j=2 ; j<a[i]/2;j++)
      {  if(a[i] % 2 == 0)
         {  flag=false;
             break;
         }
      }
     if(flag)
     { System.out.println(a[i]);
     } 
    }
  //  System.out.println(a[i]);
  }
}
