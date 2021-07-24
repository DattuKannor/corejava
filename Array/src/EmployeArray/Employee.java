package EmployeArray;

import java.util.Scanner;

public class Employee {
	int emp_id;
	String emp_name;
	double sal;
	Department d;
	MyDate m;
	public Employee(int emp_id, String emp_name, double sal, Department d, MyDate m) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.sal = sal;
		this.d = d;
		this.m = m;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", sal=" + sal + ", d=" + d + ", m=" + m + "]";
	}
	
	public static void main(String[] args) {
		Employee e[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter emp_ID,Emp Name, Sal, dept_ID,dept_name,day,month,year");
			e[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),new Department(sc.nextInt(), sc.next()),new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt()));
			System.out.println(e[i]);
		}
	}
	

}
