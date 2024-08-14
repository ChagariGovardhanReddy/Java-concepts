package arrays;

public class HowManyTimesNumRepeatedInArray {

	public static void main(String[] args) {
	   int a[]= {23,45,65,65,76,86};
	   int b = 65;
	   int count=0;
	   for(int i=0;i<=a.length-1;i++) {
		   if(b==a[i]) {
			   count++;
			   
		   }
		   
	   }
	   System.out.println(count);
	}

}
