package conditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int s=28,d=34;
      int add=0,mul=1,div=2;
      switch( mul)
      {
    	  case 0:System.out.println(s+d);
    	            break;
    	  case 1:System.out.println(s*d);
          break;
    	  case 2:System.out.println(s/d);
          break;
    	  case 3:System.out.println(s+d);
          break;
    	  case 4:System.out.println("No operation");
          break;
      }
      
	}

}
