package method;

public class MessagePrinter {
	void printMessage(String name) {
		System.out.println("This is Print Method");
		
		System.out.println("Pass String Argument :"+name);
	}
	
	public static void main(String[] args) {
		MessagePrinter mm=new MessagePrinter();
			mm.printMessage("SAGAR");	
	}

}
