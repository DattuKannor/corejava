package EmployeArray;

public class Department {

	int did;
	String dname;
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Department [Dept ID=" + did + ", Dep Name=" + dname + "]";
	}
	
	
}
