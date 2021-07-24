package ArrayElement;

public class Binary_Searching {
	
	public static void main(String[] args) {
		
		int a[]= {1,4,5,6,8,9,11,15,18};
		
		int serch=18;
		
		int l=0;
		int h=a.length-1;
		int mid=(l+h)/2;
		
		while(l<=h)
		{
		if(a[mid]==serch)
		{
			System.out.println(a[mid]+ " Element fond at index "+mid);
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
		
		}//while loop
	}

}
