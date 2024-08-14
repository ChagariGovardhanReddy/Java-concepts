package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		 
		String s="welcome";
		String s1=new String(" to java");
		
		//length()------returns length of the string
		System.out.println(s.length());
		
		//concat()-----joining two strings
		System.out.println(s.concat(s1));
		System.out.println(s);
		
		//trim()------remove spaces in right and left side
		String a="    java    ";
		String b=a.trim();
		System.out.println(b);
		
		//charAt()-----returns a character baed on index
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(6));
		
		//contains()---------check string is part of main string----returns true/false
		System.out.println(s.contains("lco"));
		System.out.println(s.contains("wec"));
		
		//equals(),equalsIgnoreCase()---returns true/false
		String s2="Welcome";
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//subString()-----extract subString from the main string
		System.out.println(s.substring(0,4));
		System.out.println(s.substring(3,7));
		
		//toUpperCase(),toLowerCase()
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split()-----divide the string into multiple parts based on delimeter
		//NOTE: * % ^ & () - we can not use as delimeters
		//ex 1
		String Str="abc@xyz";
		String a1[]= Str.split("@");
		System.out.println(Arrays.toString(a1));
		
		//ex 2
		String amount="$10,20,30";
		System.out.println(amount.replace("$","").replace(",",""));
		
		//ex 3
		String str1="abc,123@xyz";
		String a2=str1.split(",")[0];//abc
		String a3=str1.split(",")[1].split("@")[0]; //123
		String a4=str1.split(",")[1].split("@")[1]; //xyz
		
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//ex4
		String str2="abc 123 xyz";
		String str[]=str2.split(" ");
		System.out.println(Arrays.toString(str));
		
		//replace()
		String Amount="$10,20,30";
		System.out.println(Amount.replace("$","").replace(",",""));
				
		
 
	}
 
}
 
 
	
		

	


