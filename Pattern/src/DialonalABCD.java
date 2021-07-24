
public class DialonalABCD {
	
	public static void main(String[] args) {
//		A 1 1 1 
//		0 B 1 1 
//		0 0 C 1 
//		0 0 0 D 
		
		
		
		char ch='A';
		for (int i = 1; i <=4; i++) {
			
			
			for (int j = 2; j <=i; j++) {
				System.out.print("0 ");
				
			}
			
			
			for (int j =1; j <=1 ; j++) {
				 
				System.out.print(ch+" ");
				ch++;
				
			}
			for (int j = i; j <=3; j++) {
				System.out.print("1 ");
				
			}
			
			System.out.println();
			
		}
	}

}
