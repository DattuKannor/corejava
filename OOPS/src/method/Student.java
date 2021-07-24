package method;

public class Student {
	
	int rno;
	String name;
	long contactNo;
	double mark;
	void input ()
	{
		 rno=101;
		 name="Kannor Dattu";
		 contactNo=9049351729l;
		 mark=414;
		
	}
	void dispay()
	{
		System.out.println("Student Roll No. :"+rno);
		System.out.println("Student Name      :"+name);
		System.out.println("Contact Number    :"+contactNo);
		System.out.println("Total Mark        :"+mark);
		
	}
}
