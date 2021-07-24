package _9HW;

public class UserRegister {
	
	
	void registerProfile(String userName,int age,String coutry)
	{
		if(coutry.equalsIgnoreCase("india"))
		{
			System.out.println("Register");
		}
		
		else
		{
			try
			{
				throw new InvaliidCountryException("Not Regsiter,plz enter courty India");
			}
			catch (InvaliidCountryException e) {
				System.out.println(e.getMessage());
			}
		}
		
		if(age>=18)
		{
			System.out.println("Register");
		}
		
		else
		{
			try
			{
				throw new InvalidAgeException("Age Must be Grether than 18");
			}
			catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		UserRegister s=new UserRegister();
		s.registerProfile("Datu", 66,"india");
	}
	
	
	
}
