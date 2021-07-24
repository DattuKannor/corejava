package CW;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _7CW {
	
//	Generate checked exception and use multiple catch block with 
//	Exception handler.
	
	
	public static void main(String[] args)  {
		
		System.out.println("Start Main.....");
		
		
	
		try {
			FileReader fr=new FileReader("a.txt");
			
		} catch (FileNotFoundException ee) {
			System.out.println(ee.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main end.....");
		
		
		
	}
	

}
