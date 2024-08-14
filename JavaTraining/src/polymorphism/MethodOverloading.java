package polymorphism;

public class MethodOverloading {
   // method  name should be same but parameters should be different
	//it can have different type of parameters
	//Number of parameters should be different
	//order of parameters should be different
	
	void n1(int a,int b) {
		 System.out.println(a+b);
	}
	void n1(int a,int b,int c) {
		System.out.println(a-b);
	}
	void n1(int a, float b) {
		System.out.println(a*b);
	}
	void n1(float b, int a) {
		System.out.println(a+b);
		
	}
}
	
