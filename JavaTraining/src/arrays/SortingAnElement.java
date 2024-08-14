package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingAnElement {

	public static void main(String[] args) {
		//Sorting numbers
		int a[]= {244,789,667,987,345};
		System.out.println("Before sorting:"+ Arrays.toString(a));//[244,789,667,987,345]
		Arrays.sort(a);
		System.out.println("Before sorting:"+ Arrays.toString(a));//[244,789,667,987,345]
		//sorting strings
		String b[]= {"hjhj","hhj","hjjj","ffggf","yjhd"};
		System.out.println("Before sorting:"+ Arrays.toString(b));//[244,789,667,987,345]
		Arrays.sort(b);
		System.out.println("Before sorting:"+ Arrays.toString(b));//[244,789,667,987,345]
		

	}

}
