package Demo;
interface ToCreateLambda{
	int method1(Integer a,Integer b);
	//void m2();
}

public class NewClass {
	public static void main(String[] args) {
		
		Integer aa= 10;
		Integer bb =20;
		L l = new L();
		
		/*l.setA(new ToCreateLambda() {
			
			@Override
			public int method1(Integer a,Integer b) {
				return a+b;
			}
		});*/
		
		
		l.setA((a,b)->a+b);
		
		System.out.println(l.getA().method1(aa, bb));
	}
	
}

class L {
	private ToCreateLambda a;

	public ToCreateLambda getA() {
		return a;
	}

	public void setA(ToCreateLambda a) {
		this.a = a;
	}
	
}
