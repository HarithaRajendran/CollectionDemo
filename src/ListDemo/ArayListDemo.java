package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArayListDemo{
		
	public static void main(String[] args) {
		List<Student> a1 = new ArrayList<>();
		demo(a1);
		
		
	}
	
	static void demo(List<Student> a1) {
		
		a1.add(new Student(1,"test1","female"));
		a1.add(new Student(2,"test2","female"));
		a1.add(new Student(3,"test3","female"));
		
		
		System.out.println("----------------");
		
		a1.forEach(System.out::println);
		a1.forEach(Filter::filter);
		
		a1.forEach(new Filter());
	}

//	@Override
//	public Iterator<String> iterator() {return new ArrayList().iterator();
//	}
}
	
	class Filter implements Consumer<Student>{
		public static void filter(Student a1) {
			//System.out.println("hai");
			System.out.println(a1);
		}

		@Override
		public void accept(Student t) {
			System.out.println(t);
		}
	}

