
public class ThreadDemo

{

	public static void main(String args[])

	{

		MyThread thread1 = new MyThread();

		MyThread thread2 = new MyThread();

		thread1.start();

		thread2.start();
	}

}

class MyThread extends Thread

{
	SynchronizedOutput s = new SynchronizedOutput();

	static String message[] =

			{ "Java", "is", "hot,", "aromatic,", "and", "invigorating." };

	public void run()

	{

		s.displayList(getName(), message);
		s.m1();

	}

	void randomWait()

	{

		try {

			sleep((long) (3000 * Math.random()));

		} catch (InterruptedException x) {

			System.out.println("Interrupted!");

		}

	}

}

class SynchronizedOutput

{

	public synchronized void displayList(String name, String list[])

	{

		for (int i = 0; i < list.length; ++i) {

			MyThread t = (MyThread) Thread.currentThread();

			t.randomWait();

			System.out.println(name + list[i]);

		}

	}
	
	public synchronized void m1() {
		System.out.println("hhhhhhhhhh");
	}

}