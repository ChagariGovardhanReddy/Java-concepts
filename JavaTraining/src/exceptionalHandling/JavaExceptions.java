package exceptionalHandling;

public class JavaExceptions {

	public static void main(String[] args) {
		//Exceptions
		//1.Checked Exception it done by java compiler
		//Io Exception,Interrupted Exception,File not found
		//UnChecked Exception.Not identified by java compiler
		//ArthematicException,NullPointException,NumberFormatException,Array IndexOutOfBoundException
		int a=10;
		int n=0;
		//System.out.println(a/n);
		try {
			System.out.println(a/n);
		}
	catch(ArithmeticException e) {
		System.out.println("invaild number");
	}
    int b[] = new int[5];
   // System.out.println(b[6]);
    try {
    	System.out.println(b[6]);
    }
    catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println("array out of index");
    }
   // String s=null;
    //System.out.println(s.length());
   
   String s1="govardhan";
   int num=Integer.parseInt(s1);
    
}

	}


