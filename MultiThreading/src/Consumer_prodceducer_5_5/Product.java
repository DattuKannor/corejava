package Consumer_prodceducer_5_5;

public class Product 
{
  public static void main(String[] args) {
	
	  Q1 q1=new Q1();
	  Producer1 p1=new Producer1(q1);
	  
	  
	  Consumer1 c1=new Consumer1(q1);
	  p1.start();
	  c1.start();
	  
	  
	  
}
}
