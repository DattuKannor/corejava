
public class Pattern16 {
int a,b;
	
Pattern16(){
		 a=10;
	  b=20;
	}
Pattern16(Pattern16 p){
	
	 
	 System.out.println(p.a);
	 System.out.println(p.b);
 
}


	
public static void main(String[] args) {
	
	//Write a program to copy values of one object to another object using
	//constructors.
	
	Pattern16 p1=new Pattern16();
	Pattern16 p2=new Pattern16(p1);
	
	
}
}