package loopingStatements;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=855454657,y=0;
    int d;
    for(;a!=0;) {
    	d=a%10;
    	y=y+d;
    	a=a/10;
    }
    System.out.println(y);
    
	}

}
