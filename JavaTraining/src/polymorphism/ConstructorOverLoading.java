package polymorphism;

public class ConstructorOverLoading {
      
	ConstructorOverLoading(int s){
	System.out.println(s);	
	}
	ConstructorOverLoading(int f, int h){
		System.out.println(f*h);
	}
	ConstructorOverLoading(){
		System.out.println("gova");
	}
	public static void main(String[] args) {
		ConstructorOverLoading a=new ConstructorOverLoading(6);
		ConstructorOverLoading b=new ConstructorOverLoading();
		ConstructorOverLoading c=new ConstructorOverLoading(7,9);
		
	}
}
