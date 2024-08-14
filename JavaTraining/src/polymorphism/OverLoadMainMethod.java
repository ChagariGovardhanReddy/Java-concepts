package polymorphism;

public class OverLoadMainMethod {
	
	void main(int a) {
		System.out.println(a);
	}
	void main(int a,int b)
	{
	System.out.println(a+b);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadMainMethod s=new OverLoadMainMethod();
		s.main(4);
		s.main(7, 9);

	}

}
