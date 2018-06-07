package innerClasses.demo;

public class A {
	public void m1() {
		int a = 10;
		class B{
			public void m2() {
				System.out.println(a);
			}
			
		}
		B b1 = new B();
		b1.m2();
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
	}
}
