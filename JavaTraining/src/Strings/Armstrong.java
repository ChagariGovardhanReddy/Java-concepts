package Strings;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		//int num=153, sum=0,rem;
		int Num=num,sum=0,rem;
		while(num!=0) {
			rem=num%10;
			sum+=(int)Math.pow(rem, 3);
			num=num/10;
		}
		if (Num==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not an armstrong");
		}
		
	}

}
