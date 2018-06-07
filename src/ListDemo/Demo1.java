package ListDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Demo1 {
	
	
	public static void m1() {
		List<String> a1=new ArrayList<>();
		a1.add("Hari");
		a1.add("haiii");
		a1.add("haiii");
		a1.add("haiii");
		a1.add(null);
		a1.add(null);
		//a1.add(index, element);
		System.out.println(a1.contains("haiii"));

		
		a1.remove("haiii");
		
		System.out.println(a1);
		
		for(String w:a1) {
			//a1.remove("haiii");//  ConcurrentModificationException
			System.out.println(w);
		}
		System.out.println("-----------");
		
		Iterator<String> it = a1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------");
	}
	
	public static void m2() {
		List<Integer> l1 = new LinkedList<Integer>();
		
		//  l1.add("ffffff");   //Compile time exception bcoz of genrics
		
		l1.add(23);
		l1.add(0,45);
		l1.add(1,67);
		
		
		
		for(int w:l1) {
			System.out.println(w);
		}
		System.out.println("---------");
		
		ListIterator<Integer> it = l1.listIterator();
		
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------");
		
		
	}
	public static void main(String args[] ){
		
		long start = System.currentTimeMillis();
		m1();
		long end = System.currentTimeMillis();
		
		System.out.println("Total Time: "+(end-start));
		
		
		
		long start2 = System.currentTimeMillis();
		m2();
		long end2 = System.currentTimeMillis();
		
		System.out.println("Total Time: "+(end2-start2));
		
		
		
	}
}
