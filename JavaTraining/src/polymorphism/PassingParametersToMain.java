package polymorphism;

public class PassingParametersToMain {
	public static void main(String[] args) {
		for(String x:args) {
			System.out.println(x);
			
		}
		System.out.println(args.length);
	}

}
