package CW7;

public class CW7 {
	public static void main(String[] args) {
		Registration r=new Registration();
		Admmission a=new Admmission(r);
        Exam e=new Exam(a);
        r.start();
        a.start();
        e.start();
        
        
	}
}
