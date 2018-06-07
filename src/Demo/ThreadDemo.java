package Demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadDemo {
//	private static boolean stop;
//	
//	public static void main(String[] args) throws InterruptedException {
//		new Thread(new Runnable() {
//			public void run() {
//				while(!stop) {
//					System.out.println("In while,..............");
//				}
//			}
//		}).start();
//		
//		TimeUnit.SECONDS.sleep(3);
//		stop = true;
//	}
	
	static private AtomicLong id = new AtomicLong();
	
	public static long m1(){
		return (long) (65432169+id.incrementAndGet() + Math.random()+6	);
	}
	public static void main(String[] args) {
		System.out.println(m1());
		System.out.println(m1());
	}
}
