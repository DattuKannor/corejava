package Contructor;

import java.awt.Shape;

public class ShapeCircle {


public ShapeCircle()
{
	
}
public ShapeCircle(float radius) 
{
	final float pi=3.14f;
	float area=pi*radius*radius;
	System.out.println("Area of CIrcle: "+area);
}
public ShapeCircle(float radius,float pi)
{
	System.out.println("Area of circle :"+(radius*radius*pi));
}


}

	

