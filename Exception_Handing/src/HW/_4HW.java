package HW;

public class _4HW {

	//WAP to check can we have write an empty catch block?
	public static void main(String[] args) {
		int a[]= {10,45,2,12,5};
		
		try
		{
		int b=20/a[6];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
		}
		
		finally {
			System.out.println("Finally Execute.");
			
		}
	}
}
