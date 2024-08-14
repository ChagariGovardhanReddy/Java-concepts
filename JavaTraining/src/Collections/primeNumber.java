package Collections;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int fact=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			{
				fact++;
			}
		}
		if(fact==0) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		
	}

}
