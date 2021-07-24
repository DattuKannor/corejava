package basic;

public class InnerMost {
public static void main(String[] args) {
		
		
		
		int a[][]= {{1,2,3,4,8},{6,5,7,9,5},{6,5,7,9,5},{1,2,4,5,9}};
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("---------------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==0 || j==0 || j==a.length-1|| i==a.length-1)
				System.out.print(a[i][j]+" ");
				else
				System.out.print("  ");
				
			}
			System.out.println();
		}

		
}


}
