package Demo;

interface A{
	//void m1();
	public default void m2() {
		System.out.println("llllllll");
	}
}
interface B{
	public default void m1() {
		
	}
	public default void m2(){
		System.out.println("hhhhhhhh");
	}
}
public class AAA implements A,B{

	/*Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}*/
	void s() {
		A.super.m2();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		A.super.m2();
	}

	
	
}
