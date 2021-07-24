package HW;

public class _5HW {
	//WAP to handle ArrayIndexOutOfBound Exception.

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
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Execute.");
			
		}
	}
}
