package HW6;

public class Circle {
	int radius=0;
	 synchronized public void setRadius()
	 {
		 for(int i=0;i<5;i++)
		 {
			
			 radius=10;
			 notify();
		 }
	 }
	 
	 void area()
	 {
		System.out.println("Entering in area method"); 
		if(radius==0)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("area of circle is :=> "+(3.14*radius*radius));
	 }


}
