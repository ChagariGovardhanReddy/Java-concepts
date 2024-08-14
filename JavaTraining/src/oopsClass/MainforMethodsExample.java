package oopsClass;

public class MainforMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsExample me=new MethodsExample();
		me.m1();
		String s=me.m2();
		System.out.println(s);
		me.m3(90, 10);
		double h=me.m4(0.01, 0.02);
		System.out.println(h);
  System.out.println(me.m4(0.01, 0.02));
		
	}

}
