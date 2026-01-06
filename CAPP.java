import java.util.*;
class Student implements Comparable<Student>
{
   private int id;
   private String name;
   private int marks;
 
  public Student(int id , String name , int marks)
   { 
    this.id=id;
    this.name=name;
    this.marks=marks;
   }

    public int getId(){return id;}
    public String getName(){ return name;}
    public int getMarks(){ return marks;}

    public int compareTo(Student st)
    {
     
      if(this.id< st.getId())
      { return 1;
      }
     else if(this.id>st.getId())
     {  return -1;
     }
    else
     { return 0;
     }
  }
}

public class CAPP
{ public static void main(String args[])
  {
     List<Student> li=new ArrayList<>();
     li.add(new Student(1,"Rahul",90));
     li.add(new Student(9,"yuv",90));
     li.add(new Student(3,"abv",90));

    Collections.sort(li);
   for(Student s:li)
   { 
     System.out.println(s.getId()+"  "+ s.getName()+"  "+s.getMarks());
  }
  }
}