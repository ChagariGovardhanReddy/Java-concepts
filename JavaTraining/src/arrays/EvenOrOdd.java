package arrays;

public class EvenOrOdd {

	public static void main(String[] args) {
		int a[]= {4,6,8,9,5,6,0};
		int evenCount=0, oddCount=0;
		//int b[]=new int[5];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}

}
