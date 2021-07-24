package HW4;

public class ClassMainThread 
{
	
//	Give example of synchronized method 
//	in which 2 threads are trying to update same
//	thread. Give use of synchronization if 2 threads are sharing 
//	same objects.

public static void main(String[] args) {
	
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2(t1);
	
	t1.start();
	t2.start();
}
}
