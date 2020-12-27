package HW3;

public class Employee {
	
	
	int sno;
    String sname;
    double sal;
	public Employee(int sno, String sname, double sal) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [sno=" + sno + ", sname=" + sname + ", sal=" + sal + "]";
	}
	public int getSno() {
		return sno;
	}
	public String getSname() {
		return sname;
	}
	public double getSal() {
		return sal;
	}
    
    

}
