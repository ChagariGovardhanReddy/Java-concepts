package loopingStatements;

public class EvenAndOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 674754757;
		int Evencount = 0, Oddcount = 0;
		for (; a != 0;) {
			if (a % 2 == 0) {
				Evencount += 1;
			} else {
				Oddcount++;
			}
			a = a / 10;
		}
		System.out.println(Evencount);
		System.out.println(Oddcount);

	}
}
