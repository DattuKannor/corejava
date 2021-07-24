package HW4_2;

public class HW4 {

	public static void main(String[] args) {
		//4) Give example of synchronized method in which 2 threads are trying to update same
		//thread. Give use of synchronization if 2 threads are sharing same objects.
		
		Patttern p=new Patttern();
		Syn_thread1 t1=new Syn_thread1(p);
		Syn_thread2 t2=new Syn_thread2(p);
		t1.start();
		t2.start();

	}
	
}
