package Strings;

import java.util.Scanner;

public class CountOccuranceOfCharacters {

	public static void main(String[] args) {
	//Approach1	
		/*String s1="Govardhan King";
		int Totalcount=s1.length();
		int countAfter=s1.replace("a","").length();
		int Ocuurance=Totalcount-countAfter;
		System.out.println(Ocuurance);*/
		//method2
		String s1="Govardhan King";
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a letter");
		char ch= sc.next().charAt(0);
		for(int i=0;i<=s1.length()-1;i++) {
			if(ch==s1.charAt(i)) {
			count++;
			}
			
		}
		System.out.println(count);
		 	}

	}


