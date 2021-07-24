package Pattren;

public class Kaprekar 
{
	public static void main(String[] args) 
	{
	  int n=9;
	  
	  int t1=n*n;
	  int t2=t1;
	  int cnt=0;
	  
	  while(t1>0)
	  {
		  t1=t1/10;
		  cnt++;
	  }
	  
	  System.out.println(cnt);
	  int a1=0,a2=0;
	  if(cnt==2)
	  {
		a1=t2%(int)Math.pow(10, cnt-1); 
		a2=t2/(int)Math.pow(10, cnt-1); 
	  }
	  else
	  {
		  a1=t2%(int)Math.pow(10, cnt-2); 
			a2=t2%(int)Math.pow(10, cnt-2);  
	  }
	  
	  System.out.println(a1+" "+a2);
	  if((a1+a2)==n)
	  {
		  System.out.println("Karprekar");
	  }
	  
	}  
}
