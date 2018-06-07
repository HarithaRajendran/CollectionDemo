package Demo;

import java.util.ArrayList;
interface ILambdaCheck{
	void m1();
}

public class GenericDemo {
	public static void main(String[] args) {
		genericDemo();
		m2();
	}

	private static void genericDemo() {
		methodArg(new SavingsAccount(1,2));
	}

	private static <T> void methodArg(T d) {
		
	}
	

	
	/*public void m1(ArrayList<Integ> al) {
		
	}*/
	
	/*ArrayList<String> l = new ArrayList<String>();
	void l1(){
		l.
	}*/
	
	static int x = 10;
	 static void m2() {
		 int y = 20;
		 ILambdaCheck l = ()->{
			 System.out.println(x);
			 System.out.println(y);
		 };
		 l.m1();
		 System.out.println(y+"hhhhhh");
		 
	 }
}

class SavingsAccount {
	int a;
	int b;
	SavingsAccount(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	static <T> void  withdraw(int a,int b){
		a=a+b;
		System.out.println(a);
	}
}
