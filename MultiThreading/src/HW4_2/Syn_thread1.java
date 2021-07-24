package HW4_2;

public class Syn_thread1 extends Thread{

	Patttern p;

	public Syn_thread1(Patttern p) {
		super();
		this.p = p;
	};
	public void run()
	{
		p.displaypattern('*');
		p.name();
	}

}