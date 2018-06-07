package ListDemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDequeDemo {
	public static void m1() {
		Deque d = new ArrayDeque();
		
//		d.add("ggg");
//		d.addFirst("first");
		//d.addLast("last");
		
		
		for(Object d1:d) {
			System.out.println((String)d1);
		}
		System.out.println("------------");
		d.push("ggg");
		d.push("first");
		d.push("last");
	//	d.push(null); 
		
		d.pop();
		
		long start = System.currentTimeMillis();
		for(Object d1:d) {
			System.out.println(d1);
		}
		System.out.println("------------");
		long end = System.currentTimeMillis();
		
		System.out.println("Total Time: "+(end-start));
		
	//	ListIterator ll1 = d.listIterator();  //Not 
		
		
		long start1 = System.currentTimeMillis();
		Iterator i = d.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------");
		
		long end1 = System.currentTimeMillis();
		
		System.out.println("Total Time: "+(end1-start1));
		
	}
	public static void main(String[] args) {
		m1();
	}
}
