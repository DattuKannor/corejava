package ArrayElement;

public class With_0_1 {
	public static void main(String[] args) {
		int temp;
		int a[]= {26,0,67,45,0,78,54,34,10,0,34};
    for (int i = 0; i < a.length; i++) 
    {
    	  temp=0;
    	if(a[i]==temp && temp!=1)
    	{
    		temp++;
    		System.out.print(temp+" ");
    	}
    	else
    	{
    		System.out.print(a[i]+" ");
    	}
		}
    	
	}

}
