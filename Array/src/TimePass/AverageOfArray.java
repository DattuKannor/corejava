package TimePass;

public class AverageOfArray {
	
	//Write a Java program to calculate the average value of array elements
	
	
	public static void main(String[] args) 
	{
		int sum=0;
		int a[]={5,4,3};
		
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
			//System.out.println(sum);
		}
		
		System.out.println("SUM OF ARRAY ELEMENT :"+sum);
		System.out.println("AVERAGE OF ARRAY ELEMENT:"+(double)(sum/a.length));
		
	}

}
