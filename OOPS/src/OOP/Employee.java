package OOP;

public class Employee {

//	Let us Assume and do the programming: A company provides bonus of 20% to their employees if his/her year of 
//	service is more than 3 years. Create a class and its respective methods to enter the data from the user 
//	and calculate net salary of the employee based on the year of service of the employee served in that
//	company.
	
	int empid;
	String empname;
	double salary;
	double bonas;
	int year;
	
	public Employee(int empid, String empname,int year,double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.year = year;
		this.salary=salary;
		
		
	}
	
	void calculateBonas()
	{
		if(year>3)
		{
			bonas=salary*0.2;
		}
		else
		{
			bonas=0;
		}
	}
	
	
	
	void display ()
	{
		 System.out.println("***************** EMPLOYEE DETAIL**************");
		System.out.println("Eployee ID    		  :"+empid);
		System.out.println("Eployee Name   	      :"+empname);
		System.out.println("Number of Year  	  :"+year);
		System.out.println("Employee Salary 	  :"+salary);
		System.out.println("Employe Bonas         :"+bonas);
		System.out.println("Net salary of Employee:"+(salary+bonas));
				
	}
	
}
