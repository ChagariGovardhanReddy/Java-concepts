package arrays;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		int a[] = { 4, 5, 7, 9 };
		int b[] = new int[5];
		b[0] = 4;
		b[2] = 6;

		// size of an array
		System.out.println(a.length);

		// readingsingle value of an array
		System.out.println(a[2]);
		
		//reading multiple values of an array
		//method 1
		System.out.println(Arrays.toString(a));
		//method 2
		//for (int i=0; i<=b.length-1;i++) {
			//System.out.println(b[i]);
		//}
		//method 3
		for (int x:a) {
			System.out.println(x);
		}

	}

}
