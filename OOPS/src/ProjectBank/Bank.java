package ProjectBank;

import java.util.Scanner;

public class Bank {
	int id;
	String c_name;
	long mob;
	long ac;
	String a_type;
	String ifsc;
	String branch;
	double bal;
	double wh,whh;
	double dep,depp;
	void insertData()
	{
		id=101;
		c_name="Kannor Dattu Nimba";
		mob=9049351739l;
		ac=4756423532l;
		a_type="Saving";
		ifsc="CBI01011";
		branch="Malegaon";
		bal=1000.00;
	}
	void displayData()
	{
		System.out.println("Customer ID         :"+id);
		System.out.println("Customer Name       :"+c_name);
		System.out.println("Customer Contact No.:"+mob);
		System.out.println("Account Type        : "+a_type);
		System.out.println("Bank IFSC Code      :"+ifsc);
		System.out.println("Bank Brach Name     :"+branch);
		System.out.println(" Account Balance    :"+bal+"/-");
	}
	void depositAmount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deposit Amount");
	    dep=sc.nextDouble();
		System.out.println("---------------------------");
		System.out.println("Deposit Amount     :"+dep);
		bal=bal+dep;
		System.out.println("Total Balance:    :"+bal);
		
		
		
	}
	
	void withdrawAmount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdraw Amount");
		wh=sc.nextDouble();
		System.out.println("---------------------------");
		System.out.println("Deposit Amount     :"+wh);
		bal=bal-wh;
		System.out.println("Total Balance:    :"+bal);
		
	}
	
	
}
