package _10UserDefine;

public class InsufficientBalanace extends Exception {
	
	InsufficientBalanace()
	{
		System.out.println("InsufficientBalance");
	}
	
	InsufficientBalanace(String s)
	{
		super(s);
	}
	

}
