
public class CrossPattern {
	
// *	       * 
//    *   *   
//      *     
//    *   *   
//  *       * 

	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 0; j <=5; j++) {
				if((i+j)==6 || (i-j)==0 )
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}
			System.out.println();
			
		}
	}

}
