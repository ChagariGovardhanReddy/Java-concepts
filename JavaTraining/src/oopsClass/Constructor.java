package oopsClass;

public class Constructor {
	int a,b;
	Constructor(){  //default Constructor
		 a=90;
		 b=80;
		
	}
	Constructor(int x,int y){  //parameterized Constructor
		 a=x;
		 b=y;
		
	}
	void sum() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//obj for default Constructor
		Constructor cs=new Constructor();
		cs.sum();
		//obj for parameterized Constructor
				Constructor CGR=new Constructor(54 , 45);
				CGR.sum();

	}

}
