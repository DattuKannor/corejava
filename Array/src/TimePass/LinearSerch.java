package TimePass;

public class LinearSerch {

	public static void main(String[] args) {
		
	
	int a[]= {3,5,7,8,2,6,0};
	
	int serch=3;
	int cnt=0;
	for (int i = 0; i < a.length; i++) {
		if(a[i]==serch)
		{
			System.out.println(serch+" is present in given array");
			cnt++;
		}
	}
	
	if(cnt==0)
	{
		System.out.println("Not present");
	}
	}
}
