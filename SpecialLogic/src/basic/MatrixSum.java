package basic;

public class MatrixSum {
	public static void main(String[] args) {
		
		
		
		int a[][]= {{1,2,3,4},{6,5,7,9},{6,5,7,9}};
		int b[][]= {{1,2,3,4},{6,5,7,9},{6,5,7,9}};
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println();
			
		}
		
	}

}
