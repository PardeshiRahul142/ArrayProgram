package preac.pac;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
class PO implements Comparable
{
	private int id;
	private String name;
	private int marks;
	private String Course;
	
	public PO(int id , String name , int marks , String Course)
	{
	   this.id=id;
	   this.name=name;
	   this.marks=marks;
	   this.Course=Course;
	}

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

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	
	public int compareTo(Object obj)
	{
		PO p=(PO)obj;
		if(this.id>p.id)
		{
			return 1;
		}
		else if(this.id<p.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
	
	public String toString()
	{
		return  id +"\t"+name+"\t"+marks+"\t"+Course;
	}
	
}
public class Comp {

	public static void main(String[] args) {
		
		List<PO> list=new ArrayList<>();
		list.add(new PO(10,"Raj",90,"UG"));
		list.add(new PO(1,"Rehan",87,"PG"));
		list.add(new PO(9,"xcv",90,"UG"));
		list.add(new PO(3,"ytr",90,"UG"));
		list.add(new PO(2,"wqw",90,"UG"));
		list.add(new PO(1,"yt",90,"UG"));
		list.add(new PO(5,"wer",90,"UG"));
		list.add(new PO(6,"rr",90,"UG"));
		
		System.out.println("Record in collection");
		for(PO o:list)
		{
			System.out.println(o.getId()+"\t"+o.getName()+"\t"+o.getMarks()+o.getCourse());
		}
		System.out.println("After sorting collection");
		Collections.sort(list);
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			PO p=(PO)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getMarks()+p.getCourse());
		}

	}

}
