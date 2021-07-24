package HW4_2;

public class Patttern {
	synchronized public void displaypattern(char c) 
	{

		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
			//	synchronized(this){
				System.out.print(c);//}
			}
			System.out.println();
			
		}
	}
	 void name()
		{
			
			System.out.println("Current thread :"+Thread.currentThread().getName());
		}



}
