import java.io.*;
class Student implements Serializable 
{
	private int id;
	private String name;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
   
       public String toString()
       {
              return "id :"+id+"Name :"+name +"marks :"+marks;
       }
	
}
public class IOSWRAPP
{
    public static void main(String args[]) throws Exception
    {
    	  FileOutputStream fout=new FileOutputStream("C:\\pqr\\ser.text");
    	  ObjectOutputStream out=new ObjectOutputStream(fout);
    	  
    	  Student s=new Student();
    	  s.setId(1);
    	  s.setName("Rahul");
    	  s.setMarks(90);
    	  out.writeObject(s);
    	  
  
        FileInputStream fin=new FileInputStream("C:\\pqr\\ser.text");
        ObjectInputStream oin=new ObjectInputStream(fin);
       
        Object obj=oin.readObject();
 
        if(obj!=null)
        {
           Student st=(Student)obj;
           System.out.println(st);
        }
        else
         {  
           System.out.println("Data not found...");
         }
        oin.close();
        fin.close();

        out.close();
        fout.close();
    }
}