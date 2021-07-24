package Student;

import java.util.Scanner;

public class Student {
	
	
	
	// Create Student class having rollno, name, marks. Create 10 objects . Using 
//Array of Objects display information of student who got highest marks 
	Scanner sc=new Scanner(System.in);
	int rollno;
	String name;
    double mark;
	public Student(int rollno, String name, double mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	
	public double getMark()
	{
		return mark;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
	
	public static void main(String[] args) {
		Student []stu=new Student[3];
		
		for (int i = 0; i < stu.length; i++) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Student rollno,Name,Marks");
			int rollno=sc.nextInt();
			String name=sc.next();
			double mark=sc.nextDouble();
			stu[i]=new Student(rollno, name, mark);
			}
		
		
			
		
		int i;
		for ( i = 0; i < stu.length-1; i++) {
			for (int j = i+1; j < stu.length; j++) {
				
			
			if(stu[i].getMark()>stu[j].getMark())
			{
				Student t=stu[i];
				stu[i]=stu[j];
				stu[j]=t;
			}
			}
		}

		System.out.println(stu[i]);
	
		
	}
	
	}
