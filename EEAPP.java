import java.util.*;
import java.util.Comparator;
class Employee
{
  private int id;
  private String name;
  private int salary;
 
 Employee(int id ,String name,int salary)
 {
   this.id=id;
   this.name=name;
   this.salary=salary;
 }
 public void setId(int id){ this.id=id;}
 public void setName(String name){this.name=name;}
 public void setSalary(int salary){this.salary=salary;}

 public int getId(){return id;}
 public String getName(){return name;}
 public int getSalary(){return salary;}

}
class sortById implements Comparator<Employee>
{
  public int compare(Employee e ,Employee e1)
  {
      if(e.getId() > e1.getId() ){ return 1;}
      else if(e.getId() <e1.getId()){return -1;}
      else{return 0;}
  }  
}
public class EEAPP
{ public static void main(String args[])
  {
    Vector<Employee> v=new Vector<>();
    v.add(new Employee(1,"Rahul",90000));
    v.add(new Employee(43,"ROhan",54939));
    v.add(new Employee(3,"Aakash",4999));

   Collections.sort(v,new sortById());
 
    for(Employee e:v)
    {
       System.out.println("Id id :"+e.getId()+" "+ 
                          " Name is :"+e.getName()+" "+
                          " salary :"+e.getSalary());
    }
  }
}

