package cw;

public class FibonnciForwardBack {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1, c=0;
	System.out.println(a+" ");
		
		while(c<=n)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c +" ");
			
			
		}
		
		System.out.println("a= "+a+"  b="+b +" c="+c);
		
		System.out.println("-------------------");
		System.out.println(c +"\n"+b +" \n"+a);
		while(c>=1) {
			
			c=b-a;
			
			b=a;
			a=c;
			System.out.println(c+" ");
		}
	}

}
