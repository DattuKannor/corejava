package Hw9_ptogram9;

public class UseRegistration 
{
//	add the following method,
//	i. registerProfile -The parameter are String userName , int age, String country.
//	ii. Add the following logic
//d. if country is not equal to “India” throw a InvalidCountryException with error If age <
//	18 throw a InvalidAgeException with error message“ User is a Minor”.
//e. Invoke the method register Profile from the main method with the data specified and see how the program behaves:

	
	
	void registerProfile( String userName , int age, String country) 
	{
		
		if(country.equalsIgnoreCase("India"))
		{
		System.out.println("coutry Registre ");	
		}
		else
		{
			try {
			throw new InvalidCountryException("Invalid Coutry Exception");
			}
			catch (InvalidCountryException e) {
				System.out.println(e.getMessage());
			}
			
		}
		if(age<18)
		{
			try {
				throw new InvalidAgeException("Invalid Age Exception");
				
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
			
		}
		else
		{
			System.out.println("Age Regsiter");
		}
		
		System.out.println("Name :"+userName +"  "+"Age :"+age+"    "+"Country :"+country);
	}
	
	public static void main(String[] args) throws InvalidCountryException, InvalidAgeException 
	{
		UseRegistration u=new UseRegistration();
		
		u.registerProfile("Datt", 22, "India");
	}
}


