package String;

import java.util.Scanner;

public class DemoArray {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int strat_s=0;
		int end_e=0;
		int diff_d=0;
		
		int max=0;
		int a[]= {10,3,6,8,9,4,3};
		
		System.out.println("Enter the start point");
		int s=sc.nextInt();
		System.out.println("Enter the end point");
		int e=sc.nextInt();
		
		
		try {
			
			for (int i = 0; i < 500; i++) {
				if(a[i]!=0)
				{
					for (int j = s+i; j <e; j++) {
						
						int diff=a[i]-a[j];
						if(max<diff)
						{
							max=diff;
							strat_s=a[i];
							end_e=a[j];
							diff_d=diff;
							
							if(diff>=max)
							{
								System.out.println("Start   :"+strat_s);
								System.out.println("End     :"+end_e);
								System.out.println("diff     :"+diff);
								break;
								
							}
							
							
						}
						
					}
				}
				
			}
			
		} catch (Exception e2) {
			System.out.println("ERROR :"+e2);
		}
	}

}
