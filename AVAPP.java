import java.util.*;
class Age extends RuntimeException
{
   int age;
  public Age(int a)
   {
      this.age=a;
   }
  public String getMessage()
  {
    return "User is not able for voting";
  }
}
class Vote
{
   public void verify(int age)
   {
       if(age<18)
       {
          Age a=new Age(age);
          throw a;
       }
      else
       {
         System.out.println("User is able for Voting");
       }
   }
}
public class AVAPP
{ 
   public static void main(String args[])
   {
     Vote v=new Vote();
   
    try
    {
       v.verify(18); 
    }
    catch(Age e)
    {
       System.out.println(e.getMessage());
    }
   }
}

