package CW;

public class _5CW {
	//Show the use of finally block.
	
  public static void main(String[] args) {
	
	  System.out.println("Main Start....");
	  try {
		  
		  int a=10/0;
		    
	} 
	  catch (Exception e) {
		System.out.println(e.getMessage());
	}
	  finally
	  {
		 System.out.println("\nFinally Execute...."); 
	  }
	  
	  System.out.println("Main end.....");
}

}
