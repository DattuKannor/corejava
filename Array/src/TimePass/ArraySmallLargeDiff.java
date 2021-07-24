package TimePass;

public class ArraySmallLargeDiff {
	public static void main(String[] args) {
		
		
		int a[]= {12,56,23,45,98,56,70};
		
		int min=a[1];
		int max=a[1];
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
		System.out.println(min);
		System.out.println(max);
		System.out.println("Diff :"+(max-min));
	}

}
