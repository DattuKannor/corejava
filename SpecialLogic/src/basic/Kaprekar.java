package basic;

public class Kaprekar
{

	public static void main(String[] args) {
		
		int n,t1,t2,cnt=0;
		
		n=57;
		t1=n*n;
		t2=t1;
		
		
		while (t1>0) {
			
			t1=t1/10;
			cnt++;
			
			
		}
		
		System.out.println(cnt);
		
		int a1=0,a2=0;
		
		
		
		if(cnt==2)
		{
			a1=t2/(int)Math.pow(10,cnt-1);
			a2=t2%(int)Math.pow(10,cnt-1);
			
		}
		else
		{
		a1=t2/(int)Math.pow(10,cnt-2);
		a2=t2%(int)Math.pow(10,cnt-2);
		}
		
		if((a1+a2)==n)
		{
			System.out.println("Kaprekar");
		}
		else
		{
			System.out.println("Not Kaprekar");
		}
	}
}
