package Strings;

import java.util.Scanner;

public class Palindrome {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		
	//	String s1="amma";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	if (s1.equals(s2))
		{  System.out.println("palindrome");
		
		}
		else
		{System.out.println(" not a palindrome");
		
		
		}

	}

}
