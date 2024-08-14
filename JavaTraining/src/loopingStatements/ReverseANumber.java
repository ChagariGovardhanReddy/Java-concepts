package loopingStatements;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=988978675,rem,rev=0;
		for(;a!=0;) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		
       				
		}
		System.out.println(rev);

	}

}
