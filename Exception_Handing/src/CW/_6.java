package CW;

public class _6 {
//	Generate exception to check if still 
//	finally block get executed.
	
	public static void main(String[] args) {
		System.out.println("Main Start....");
		  try {
			  
			  int a=10/0;
			    
		} 
		  finally
		  {
			 System.out.println("\nFinally Execute...."); 
		  }
		  
		  System.out.println("Main end.....");
	}

	}


