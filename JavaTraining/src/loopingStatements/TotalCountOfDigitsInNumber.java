package loopingStatements;

public class TotalCountOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a=6574634587l;
		int count=0;
		for(;a!=0;) {
			a=a/10;
			count+=1;
			//a=a/10;
		}
		System.out.println(count);

	}

}
