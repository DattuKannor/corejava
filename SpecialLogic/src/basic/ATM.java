package basic;


public class ATM {

	public static void main(String[] args) {
		
	
	  int orignal=2850;
	  int rem=orignal%100;   //50
	  System.out.println("Rem :"+rem);

	  int fix=orignal-rem;    //2400
	  System.out.println("FIX ;"+fix);
	  


	  int note1 =orignal/orignal;   //1
	 
    int rem1=orignal%1000;
	  System.out.println("rem1 :"+rem1);//240
      
	  int last=orignal%1000;
		System.out.println("LAst "+last);//450

		System.out.println("---------");

	  System.out.println(orignal-rem1+" : Note :"+note1);//2000---> 1
 
		int note2=rem1/rem1;//1

		int x=last-rem; //400
		int y=x/2;//200
		System.out.println(y+" note2 :"+note2);

		
		
	 // System.out.println(orignal%1000);
		int note3=y/100;//2	
System.out.println((x/4)+" Note3 :"+note3);

  int note4=rem/10;
  
  System.out.println(rem+" note4  :"+note4);
			
}
}
