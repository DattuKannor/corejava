package Contructor;

public class Employee1 {

	private int id;
	private String name;
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
	
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.setId(01);
		System.out.println("Employee ID :"+e.getId());
		
		e.setName("SAGAR");
		System.out.println("Employee Name :"+e.getName());
		
		e.setId(02);
		System.out.println("Employee ID :"+e.getId());
		
		e.setName("Dattu");
		System.out.println("Employee Name :"+e.getName());
	}
}
