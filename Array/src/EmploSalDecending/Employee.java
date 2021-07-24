package EmploSalDecending;

public class Employee {
	
	private String name;
	private int eid;
	private double sal;
	public Employee( int eid,String name, double sal) {
		super();
		this.name = name;
		this.eid = eid;
		this.sal = sal;
	}
	
	public double getSal() {
		return sal;
	}
public  int getEid()
{
	return eid;
	
}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", sal=" + sal + "]";
	}
	
	
	
	
	
	
		
	

}
