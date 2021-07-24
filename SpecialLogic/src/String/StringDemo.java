package String;

public class StringDemo {
	public static void main(String[] args) {
		String s="sagar";
		
		int cnt=1;
		char c[]=System.arraycopy();
		
//		private final char val[];
//		
//		public char[] dk() {
//	        // Cannot use Arrays.copyOf because of class initialization order issues
//	        char result[] = new char[value.length];
//	        System.arraycopy(value, 0, result, 0, value.length);
//	        return result;
//	    }
//		
		//char ch[]=new char['\0'];
		
		try
		{
		for (int i = 0; i < '\0'+cnt; i++) {
			
			System.out.println('\0'+cnt);
			cnt++;
			
			
			if(cnt==500)
			{
				break;
			}
		}
		}
		catch (Exception e) {
		System.out.println(" ERROR");
		}
	}

}
