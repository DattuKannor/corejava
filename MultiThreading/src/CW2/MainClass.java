package CW2;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Runnble1 t1=new Runnble1();
		Runnble2 t2=new Runnble2();
		
		
		
		Thread tt1=new Thread(t1);
		Thread tt2=new Thread(t2);
		
		
		tt1.start();
		tt2.start();
	}

}
