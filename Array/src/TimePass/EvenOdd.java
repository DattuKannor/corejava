package TimePass;

public class EvenOdd {
public static void main(String[] args) {
	
	int a[]= {3,4,2,6,7,8,9,11};
	int e[]=new int[6];
	int o[]=new int[6];
	int cnt1=0,cnt2=0;
	
	for (int i = 0; i < a.length; i++) {
	 
	    if(a[i]%2==0)
	    {
	    	e[cnt1]=a[i];
	    	cnt1++;
	    }
	    else
	    {
	    	o[cnt2]=a[i];
	    	cnt2++;
	    }
	}
	
	
	for (int i = 0; i <cnt1; i++) {
		
		System.out.print(o[i]+" ");
	}
	
	System.out.println();
	for (int i = 0; i < cnt2; i++) {
		
		System.out.print(e[i]+" ");
	}
}
}
