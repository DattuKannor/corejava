package synchonize.method;

public class Pattern {
	
	
 public synchronized void withdraw(char c)
	{
		
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <5; j++) 
			{
				//synchronized (this) {  o/p one line @ one #
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//					System.out.println(e);
//				}
//				
					System.out.print(c);
				}
			System.out.println();
			}
			
			
		}


	
	
	


}
