import java.util.*;
class Employee
{
  private int id;
  private String name;
  private int salary;
 
 public void setId(int id){ this.id=id;}
 public void setName(String name){this.name=name;}
 public void setSalary(int salary){this.salary=salary;}

 public int getId(){return id;}
 public String getName(){return name;}
 public int getSalary(){return salary;}

}
public class EmployeeMenu
{ public static void main(String args[])
  { 
     Scanner sc=new Scanner(System.in);
     Vector<Employee> v=new Vector<>();
     Employee emp[]=new Employee[2];
     for(int i=0;i<emp.length;i++)
     {
           emp[i]=new Employee();
           System.out.println("Enter the id,name,salary of employee :"+(i+1));
           int id=sc.nextInt();
           String name=sc.nextLine();
           sc.nextLine();
           int salary=sc.nextInt();


          emp[i].setId(id);
          emp[i].setName(name);
          emp[i].setSalary(salary);
        
          v.add(emp[i]);     
     }//for

     System.out.println("Employee data is ....");
     for(Employee e:v)
     {
        System.out.println("id is :"+e.getId()+ " " +"Name is :"+e.getName()+ "  "+"Salary is :"+e.getSalary());
     }
  }//main
}//class