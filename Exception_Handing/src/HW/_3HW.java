package HW;

public class _3HW {
//Show any one Exception and catch that Exception.
	
	public static void main(String[] args) {
		int a[]= {10,45,2,12,5};
		
		try
		{
		int b=20/a[6];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Execute.");
			
		}
	}
}
