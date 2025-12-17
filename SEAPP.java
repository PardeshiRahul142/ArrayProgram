import java.io.*;
import java.util.*;
class Emp implements Serializable
{
	private int id;
	private String name;
	private int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
}
public class SEAPP {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fout=new FileOutputStream("C:\\pqr\\abc");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		
		Emp emp=new Emp();
		emp.setId(1);
		emp.setName("Rahul");
		emp.setSal(21000);
		
		out.writeObject(emp);
		System.out.println("Write data successfully...");
		out.close();
		fout.close();
		
	}

}
