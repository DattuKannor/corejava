package basic;

public class AllUpper {
public static void main(String[] args) {
	
	
	String s="SaGaR";
	
	char ch[]=s.toCharArray();
	
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]>='a' && ch[i]<='z')
		{
			System.out.println((char)(ch[i]-32));
		}
		else
		{
			System.out.println(ch[i]);
		}
	}
	
	
}
}
