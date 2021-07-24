package Contructor;

import java.util.Scanner;

public class Employee {
	
	
	int eno;
	String name;
	String add;
	
Employee(){
	
}


public Employee(int eno, String name, String add) {
	super();
	this.eno = eno;
	this.name = name;
	this.add = add;
}


double salary()
{
	double sal=20000;
	return sal;
}

void display()
  {
	
	
	System.out.println("Emp No :"+eno);
	System.out.println("Emp name :"+name);
	System.out.println("Emp add :"+add);
  }
  
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter eno,name,add");
	 int eno=s.nextInt();
	 String name=s.next();
	 String add=s.next();
	 
	 Employee e=new Employee(eno,name,add);
	 e.display();
	 System.out.println("Salary :"+e.salary());
	 
}
}
