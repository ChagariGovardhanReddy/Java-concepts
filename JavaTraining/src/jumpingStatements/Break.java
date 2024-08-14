package jumpingStatements;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
       for(int a=0;a<=10;a++) {
    	   if(a==5) {
    	   break;
       }
    	   System.out.println(a);
	}
       
       for(int i=20;i>=11;i--) {
    	   if(i==15) {
    		   break;
    	   }
    	   System.out.println(i);
       }

}
}