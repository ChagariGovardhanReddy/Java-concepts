package arrays;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int a[]= {23,45,87,59,43};
		int b=45;
		boolean status=false;
		for(int i=0;i<=a.length-1;i++) {
			if(b==a[i]) {
				//System.out.println(i); to find index
				System.out.println("number  found");
				status=true;
				break;
			}
		}
		if(status==false) {
			System.out.println("number not found");
		}

	}

}
