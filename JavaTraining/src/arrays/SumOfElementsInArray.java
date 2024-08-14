package arrays;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int a[]= {32,24,65,87,97};
		int sum=0;
		for(int i=a.length-1;i>=0;i--) {
			sum=sum+a[i];
			//System.out.println(sum);
		}
		System.out.println(sum);

	}

}
