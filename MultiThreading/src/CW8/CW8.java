package CW8;

public class CW8 {
	//What is deadlock? Give one example of deadlock.
	public static void main(String[] args) {
		Deadlock q=new Deadlock();
		Dead_Thread1 t1=new Dead_Thread1(q);
		Dead_Thread2 t2=new Dead_Thread2(q);
        t1.start();
        t2.start();
	}


}
