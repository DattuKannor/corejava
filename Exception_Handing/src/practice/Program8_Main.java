package practice;

import java.util.Scanner;

public class Program8_Main {
	public static void main(String[] args) {
		Program8 p=new Program8();
		try {
			p.division(16,2 );
		} catch (Exception e) {
			System.out.println("Divisor cannot be zero");
		}
		finally {
		    System.out.println(p.result);
		}
	}

}
