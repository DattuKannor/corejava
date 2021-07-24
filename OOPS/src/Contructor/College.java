package Contructor;

public class College {
	int c_code;
	String name;
	String add;
	void inputc()
	{
		c_code=101;
		name="MSG College";
		add="At Malegaon (Nashik)";
		
	}
	void displayc() 
	{
		System.out.println("College Code     :"+c_code);
		System.out.println("College Name     :"+name);
		System.out.println("College Address  :"+add);
		
	}
	
	class Department
	{
		int d_id;
		String d_name;
		
		void inputd()
		{
		d_id=111;
		d_name="Computer";
		
		}
		
		void displayd()
		{
			System.out.println("Depardment ID  :"+d_id);
			System.out.println("Department Name:"+d_name);
		}
		
		
	}
	
	public static void main(String[] args) {
		College c=new College();
		c.inputc();
		c.displayc();
		College.Department dp=c.new Department();
		dp.inputd();
		dp.displayd();
		
	}

}
