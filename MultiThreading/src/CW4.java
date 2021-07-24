
public class CW4 extends Thread {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Program_1 p=new Program_1();
		Program_1 p2=new Program_1();
		
		p.start();
		p2.start();
	}

}
 

