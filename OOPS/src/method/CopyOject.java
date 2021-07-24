package method;

public class CopyOject {
	
	int a,b;

	public CopyOject() {
		a=10;
		b=20;
	
		System.out.println("a="+a+"  b="+b);
	}
	
	
	void m1(CopyOject c)
	{
		
		
		
		System.out.println("\n\nCopy One Objcect into Anather ");
		System.out.println("a="+c.a);
	
		
		System.out.println("b="+c.b);
		
	}
	public static void main(String[] args) {
		
		
		CopyOject c1=new CopyOject();
		
		CopyOject c2=new CopyOject();
		
		
		c1.m1(c2);
	   
		
		
		
	}

}
