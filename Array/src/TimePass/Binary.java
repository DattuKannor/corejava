package TimePass;

public class Binary {
	
	//2. Write a program to enter elements and perform binary search.
	
	public static void main(String[] args) {
		int a[]= {1,3,4,8,10,67,99,100};
		
		int l=0;
		int serch=98;
		int h=a.length-1;
		int mid=(l+h)/2;
		
		while(l<=h)
		{
		if(a[mid]==serch)
		{
			System.out.println("Element Sound at "+mid+" index");
			break;
		}
		else if(a[mid]<serch)
		{
			l=mid+1;
			
		}
		else
		{
			h=mid-1;
		}
		
		mid=(h+l)/2;
	}
		if(l>h)
		{
			System.out.println("Element not founds..");
		}
	}

}
