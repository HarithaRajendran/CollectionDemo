package lambdapractice;

import java.util.Locale;
import java.util.function.BiFunction;

public class MethodRef1<T,U> {
	
	MethodRef1(T a,U b){
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		BiFunction<String, String, Locale> ex = new BiFunction<String, String, Locale>() {

			@Override
			public Locale apply(String t, String u) {
				return new Locale(t +"---- "+ u);
			}
		};
		
		//BiFunction<String, String, MethodRef1> ex = MethodRef1::new;
		
		
		
		System.out.println(ex.apply("LLLLLl1","N2"));
	}
	
	
}
