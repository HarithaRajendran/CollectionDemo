package innerClasses.demo;

public class OuterClass {

	class InnerClass {
		

		public void m2() {
			class m3 {
				public void mp(int a,int b) {
					System.out.println(a+b);
				}
				
				
		}
			new m3().mp(10,80);
			
			new m3().mp(10,80);
			
	}
	}

	public static void main(String args[]) {
		OuterClass o = new OuterClass();
		OuterClass.InnerClass i = o.new InnerClass();
		i.m2();
	}
}
