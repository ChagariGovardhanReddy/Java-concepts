package arrays;

public class MaxAndMin {

	public static void main(String[] args) {
		int a[]= {778,979,435,789,123,234};
		int max=a[0],min=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
				
			}
			if(a[i]<min) {
				min=a[i];
			}
				
		}
		System.out.println(max);
		System.out.println(min);

	}

}
