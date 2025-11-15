
//Q4. Course Management System – Delete Course by ID
//Description:
// Interface CourseOperations with methods addCourse(), deleteCourse(int id), viewCourses().
//Delete by course ID, handle case if ID not found.
//Show updated list.
//Focus:
 //Delete logic, shifting array elements, proper interface usage.

import java.util.*;
interface CourceInter
{
   public void addCource();
   public void deleteCource(int id);
   public void viewCource();
}
class Cource
{
   private int id;
   private String name;
   private int fee;

   public void setId(int id)
   {
     this.id=id;
   }
   public int getId()
   {
      return id;
   }
   public void setName(String name)
   {
      this.name=name;
   }
   public String getName()
   {
     return name;
   }
   public void setFee(int fee)
   {
     this.fee=fee;
   }
   public int getFee()
   {
     return fee;
   }
}//cource
class CoureOperation implements CourceInter
{   
    Scanner sc=new Scanner(System.in);
    Cource[] c;
    int count=0;
   CoureOperation(int size)
   {
     c=new Cource[size];
   }
   public void addCource()
   {
    if(count < c.length)
    {
    System.out.println("Enter the cource id , name , fee ");
    int id=sc.nextInt();
    sc.nextLine();
    String name=sc.nextLine();
    int fee=sc.nextInt();
    
    c[count].setId(id);
    c[count].setName(name);
    c[count].setFee(fee); 
    
    count++;
    System.out.println("Record added successfully !");
    }
    else
    {
      System.out.println("Can not add cource");
    }
   }//addCource
    
    public void deleteCource(int Eid)
    {
      boolean isFound=false;
      for(int i=0;i<c.length;i++)
      {
         if(c[i].getId() == Eid)
         {
            c[i].setId(-1);
             isFound=true;
              break;
         }
      }
      if(!isFound)
       {
         System.out.println("Id not found");
       }

    }//DELETE cource 
    
    public void viewCource()
    {
     for(int i=0;i<c.length;i++)
     {
       if(c[i].getId() !=-1)
       {
         System.out.println("Id id :"+c[i].getId()+"  "+"Name :"+c[i].getName()+" "+" Fee :"+c[i].getFee());
       }
     }
    }//viewCource
   
}//courceOperation
public class CourceApp
{   public static void main(String argds[])
    {
      CoureOperation cou=new CoureOperation(2);
      Scanner sc=new Scanner(System.in);
      while(true)
      {
        System.out.println("-----------------------------Meanu-------------------------------");
        System.out.println("1.addCource");     
        System.out.println("2.delte cource");
        System.out.println("3.view Cource");
        System.out.println("Exit...");
        System.out.println("Enter your choice ");
        int ch=sc.nextInt();
      switch(ch)
       {
        case 1: 
                 cou.addCource();
                  break;
        case 2:
              System.out.println("Enter the id where record delete");
              int id=sc.nextInt();
              cou.deleteCource(id);
               break;
        case 3:
               cou.viewCource();
        case 4:
               System.out.println("Exit...");
                return;
         default :
                    System.out.println("Invalid input");
                     break;
       }//switch

  
      }//while
    }//main method
}//main class









