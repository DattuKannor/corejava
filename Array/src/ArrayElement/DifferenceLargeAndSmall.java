package ArrayElement;

public class DifferenceLargeAndSmall {
	public static void main(String[] args) {
		
				int a[]= {34,56,57,100,89};
				int min=a[1];
				int max=a[1];
				int cnt=0;
				//System.out.println("a[0] :"+min);
				int t;
				
				for (int i = 0; i < a.length; i++) {
					if(a[i]<min)
					{
						min=a[i];
					}
					
					
						if(a[i]>max)
						{
							max=a[i];
						}
					}
					
				
				System.out.println("Small:"+min);
				System.out.println("Large:"+max);
				System.out.println("DIFFERENCE :"+(max-min));
				
					}

}
