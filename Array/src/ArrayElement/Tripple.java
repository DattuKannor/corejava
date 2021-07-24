package ArrayElement;

public class Tripple {
	public static void main(String[] args) {
		int a[]= {1,5,7,9,3};
		
		int n=15;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					
					if((a[i]+a[j]+a[k])<n)
					{
						System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
					}
					
				}
			}
			System.out.println();
		}
	}

}
