package method;

public class AccountDetails {
	
	
	public static void main(String[] args) {
		Account ac=new Account();
		System.out.println("\n\n\n **************CUSTOMER A/C DETAIL***************\n");
		ac.insertData();
		ac.displayData();
		System.out.println("-----------------------------------");
		ac.depositAmount();
		System.out.println("-----------------------------------");
		ac.withdrawAmount();
		
	}

}
