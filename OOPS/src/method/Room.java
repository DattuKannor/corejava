package method;

import java.util.Scanner;

public class Room {

	int l, w,h;
	float area;
	

	Scanner sc=new Scanner(System.in);
	
	
	float whiteWashingArea()
	{
		System.out.println("Enter legth,width,height");
		l=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		
		 area=2*l+w*h+(l*w);
		return area;
	}
	
	int whiteWashingCost()
	{
		float bill=(int)area*80;
		return (int)bill;
	}
	
	int flooringCost()
	{
		int fg=l*w*200;
		int fc=l*w*100;
		int total_c=fg+fc;
		return total_c;
		
		
	}
	
	public static void main(String[] args) {
		Room r=new Room();
		System.out.println("White WAshing Area"+r.whiteWashingArea());
		
		System.out.println("White Washing Cost:"+r.whiteWashingCost());
		
		System.out.println("Flooring Cost :"+r.flooringCost());
	}
}
