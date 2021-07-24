package HW2;



public class ThreadSecond extends Thread
{
     
    public void run() {
    	 int n=5;
         
		for (int i = 1; i <=10; i++) {
			
			System.out.println(n+" * "+i +" = "+(n*i));
		}
	}
 
}
