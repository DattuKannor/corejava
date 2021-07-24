
public class ABCD {
	public static void main(String[] args) {

for (int i = 1; i <=5; i++) {
	for (int j = 1; j <=9; j++) {
		if((j-i)==4  || (i+j)==6)
		{
		System.out.print("A");
		}
		else if((i+j)==7 || (j-i)==3 )
		{
			System.out.print("B");
		}
		else
		{
			System.out.print(" ");
		}
		
	}
	
	
	
	System.out.println();
	
}
		
		
	}

}
