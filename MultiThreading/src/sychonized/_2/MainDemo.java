package sychonized._2;


public class MainDemo {
	
	
	public static void main(String[] args) {
Pattern p1=new Pattern();
		
		Thread1 t1=new Thread1(p1);
		Thread2 t2=new Thread2(p1);
		
		t1.start();
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
		t2.start();
	}

}
