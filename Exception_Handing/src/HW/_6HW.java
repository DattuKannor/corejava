package HW;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _6HW {
// WAP to check what happen when Exception 
//is thrown by main method
	
	public static void main(String[] args)throws FileNotFoundException  {
		
		System.out.println("Main Start");
		FileReader fr=new FileReader("A.txt");
		
		System.out.println("Main End");
	
	}

}
