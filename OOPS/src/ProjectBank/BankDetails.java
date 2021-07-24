package ProjectBank;

import java.util.Scanner;

public class BankDetails {
	
	
	public static void main(String[] args) {
		Bank bn=new Bank();
//		String unn="dattu";
//		String passs="dattu";
		 Scanner sc=new Scanner(System.in);
		System.out.println("\n\n\n**********WELCOME IN CENTRAL BANK*******************");
		System.out.println("Enter ur Name:");
		String name=sc.next();
		
		System.out.println("----WELCOME "+name+" IN CENTRAL BANK---\n\t ________Plz Enter ur User name and Password___________");
		
		System.out.println("Enter User Name: ");
		String un=sc.next();
		
		System.out.println("Enter password :");
		String pass=sc.next();
		
		if(un.equals("dattu") && pass.equals("dk"))
		{
System.out.println("\n"+name+" YOU ARE VALID USER");
			
			System.out.println("---------YOUR ACOUNT DETAILS--------");
			//Bank bn=new Bank();
			
			bn.insertData();
			bn.displayData();
			
			System.out.println("\n\n1.Deposit Amount\n 2.WithDraw Amount \n 3.Exit");
			System.out.println("Enter  U r Choice\n--------------------\n");
			int ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				
				bn.depositAmount();
				break;
				
			case 2:
				
				bn.withdrawAmount();
				break;
				
           case 3:
				
				System.exit(0);

			default:
				System.out.println("Plz Enter choice between 1 to 3");
			}
			
			//System.out.println("Enter ur Choice":);
			
			}
		else
		{
			System.out.println("Invalid User ");
			
			
			
			
		}

}
}