package loopingStatements;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int d=128;
	  int Num=d,rev=0,rem;
	  for(;d!=0;) {
		  rem=d%10;
		  rev=rev*10+rem;
		  d=d/10;
	  }
	  if(Num==rev) {
		  System.out.println("palindrome");
	  }
	  else {
	  System.out.println("Not a palindrome");
	}

}
}