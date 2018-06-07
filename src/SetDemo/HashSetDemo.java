package SetDemo;

import java.util.HashSet;
import java.util.Set;

import ListDemo.Student;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Student> set1 = new HashSet<>();
		hashSetDemo(set1);
	}

	private static void hashSetDemo(Set<Student> set1) {
		set1.add(new Student(1,"Haritha","female"));
		set1.add(new Student(1,"Haritha","female"));
		set1.add(new Student(2,"Haritha","female"));
		System.out.println(set1.contains(new Student(2,"Haritha","female")));
		set1.forEach(System.out::println);
		//System.out.println(set1.spliterator().toString());
		System.out.println(set1);
	}
}
