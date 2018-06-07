package genericsDemo;

import java.util.ArrayList;
import java.util.List;

public class class1 {
	
	public static List<? extends Number> sum(List<? extends Number> list){
		//List<Double> sum;
//		for(Number n : list){
//			System.out.println();
//		}
		return list;
	}
	
	public static void main(String[] args) {
		List a = sum(new ArrayList<Integer>());
		
		System.out.println(a);
	}
	
}
