
public class Kaprekar {
public static void main(String[] args) {
//	Given a number, the task is to check if it is Kaprekar number or not. 
//	A Kaprekar number is a number whose square when divided into two parts and
//	such that sum of parts is equal to the original number.(April Monthly)
	
	int cnt=0,n=55,t1,t2;
	
	
	t1=n*n;
	t2=t1;
	
	while(t1>0)
	{
		t1=t1/10;
		cnt++;
	}
	System.out.println("Cnt :"+cnt);
	
	int a1=0,a2=0;
	if(cnt==2)
	{
	  a1=t2/(int)Math.pow(10, cnt-1);
	  a2=t2%(int)Math.pow(10, cnt-1); 
	  System.out.println("a1="+a1+"\t"+"a2="+a2);
	}
	else
	{
		a1=t2/(int)Math.pow(10, cnt-2);
		  a2=t2%(int)Math.pow(10, cnt-2); 
		  System.out.println("a1="+a1+"\t"+"a2="+a2);
			
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
