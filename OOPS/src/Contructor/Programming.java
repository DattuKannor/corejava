
package Contructor;

public class Programming {
	public Programming() {
		System.out.println("\"I want to larn ________ \"");
		
	}
	Programming(String name)
	{
		System.out.println("\"I want to larn "+name+" \"");
	}
	
	
public static void main(String[] args) {
//	Create a class named 'Programming'. While creating an object of the class, 
//	if nothing is passed to it, then the message "I want to learn _____ language" 
//	should be printed. If some String is passed it, then in place of "_____” the name of"
//			+ " that String variable should be printed. For example, while Creating object"
//			+ " if we pass "Java", then"
//			+ " " I want to learn Java" should be printed.
	
	Programming p=new Programming();
	Programming p1=new Programming("Java");
}
}
