package practice;

public class _2Demo {
	
	public static void main(String[] args) {
		
		int a=10;
		
		System.out.println("a="+a);
		

  try
  {
	  a=a/0;
  }
  catch(Exception e)
  {
	  System.out.println(e.getMessage());
  }
		
	}

}
