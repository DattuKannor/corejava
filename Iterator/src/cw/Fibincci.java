package cw;// 0 1 1  2  3   5  8
public class Fibincci {
	public static void main(String[] args) {
		int a=0,b=1,c=0;
		System.out.println(a+" "+b);
		while(c<=20)
		{
		  
			System.out.println(" "+ c);
			a=b;
			  b=a;
			 c=a+b;
			
			
			 c++;
		}
	}

}
