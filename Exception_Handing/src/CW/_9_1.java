package CW;

public class _9_1 {
public static void main(String[] args) {
		
		System.out.println("Start Main.....");
		
	m1();
	throw new ArithmeticException("DIVIDE BY ZERO");
		//System.out.println("Main end.....");
		
		
	
}

   public static void m1() throws ArithmeticException
   {
	   try {
		  int  a=10/0;
		
	} catch (ArithmeticException e) {
		
	}
   }

}
