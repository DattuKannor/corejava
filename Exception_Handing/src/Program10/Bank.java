package Program10;

public class Bank {
	static double balance=5000;
	static void withdraw(int amt)
	{
		if(balance<amt)
		{
			try {
				throw new InvalideAmount("Invalid Amt");
			} catch (InvalideAmount e) {
			System.out.println(e.getMessage());
			}
		}
		else
		{
			balance=balance-amt;
			System.out.println(balance);
			System.out.println("WithDraw Successfully");
		}
	}
	
	
	public static void main(String[] args) {
		withdraw(600);
	}

}
