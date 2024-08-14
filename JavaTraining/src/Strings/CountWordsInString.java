package Strings;

import java.util.Arrays;

public class CountWordsInString {

	public static void main(String[] args) {
		String s ="Welcome to party BB";
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		int count=0;
		for(int i=0;i<=str.length-1;i++) {
			count++;
		}
		
  System.out.println(count);

	}
	//for(String x:str)

}
