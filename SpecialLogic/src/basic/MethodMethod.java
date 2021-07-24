package basic;

interface FuncInterface{
    int abstractFun(int a, int b); 
}

public class MethodMethod {
	
	FuncInterface f = (int a,int b)-> a+b; 
	
	
	 
	
//	FuncInterface f;
	
	public void  calculator()
	 {
		 System.out.println();
	 }
	public static void main(String[] args) {
		
		MethodMethod m = new MethodMethod();
		m.calculator();
	}
	
	
	
	 

}
