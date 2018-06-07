package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
	
	public static void demo() {
		String array[] = new String[] {"a","b","c"};
//		for(String s:array) {
//			System.out.println(s);
//		}
		
		List<String> list = Arrays.asList(array);
		System.out.println(list);
		
		//list.add("t");
		
		List<String> list1 = new ArrayList(Arrays.asList(array));
		System.out.println(list1);
		
		list1.add("t");
		
		int[] a = new int[] {0,1,2,3,4};
		//IntBinaryOperatorImpl intBinaryOperatorImpl = new IntBinaryOperatorImpl();
		//Arrays.parallelPrefix(1,op);
		
	}
	
	public static void main(String[] args) {
		demo();
	}
}
