package Contructor;

public class Vehicle {
	String color;
	int noOfwheel;
	int noOfGear;
	
	Vehicle()
	{
		
		noOfwheel=2;
		
		
	}
	
	Vehicle(String color,int noOfGear)
	{
		this();
		System.out.println("COLOR      : "+color);
		System.out.println("NO OF GEAR :"+noOfGear);
		System.out.println("NO OF WHEEL :"+noOfwheel);
		
	}
	
  public static void main(String[] args) {
	  Vehicle v1=new Vehicle();
		
	Vehicle v=new Vehicle("RED",4);
	
}
}
