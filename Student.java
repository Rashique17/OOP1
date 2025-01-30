import java.lang.*;

public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
	public Student()
	{
		
	}
	public Student(int sid,String sname, double c)
	{
		id=sid;
		name=sname;
		cgpa=c;
	}
	
	public void displayInfo()
	{
		System.out.println("Student Name is :"+name);
		System.out.println("Student ID is   :"+id);
		System.out.println("CGPA is :"+cgpa);
	}
	public static void main (String args[])
	{
		Student s1= new Student(100,"Pavel",3.48);
		s1.displayInfo();
	}
	
}