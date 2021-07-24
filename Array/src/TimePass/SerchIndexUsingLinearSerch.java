package TimePass;

//Write a Java program to find the index of an array element.
public class SerchIndexUsingLinearSerch {
	public static void main(String[] args) {
		
		int a[]= {7,9,54,23,45,13,4,5};
		
		int serch=13;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==serch)
			{
				System.out.println("Element found at index "+i);
		      }
		}
	}

}
