package Collections;

import java.util.ArrayList;

public class arrayListExample {
	// all the list  can accept duplicate values
     //ArrayList, Linkedlist,Vector-Implementing list interface
//Array has fixed size where as arraylist has dynamic size
	//you can acess and insert any value in any index
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<String> a=new ArrayList<String>();
           a.add("gova");
           a.add("java");
           a.add("java");
           System.out.println(a);
           a.add(0,"student");
           System.out.println(a);
           a.remove(1);
           a.remove("java");
           System.out.println(a);
           a.get(0);
           System.out.println(a);
           //testing
           System.out.println(a.contains("testing"));
          System.out.println( a.indexOf("rahul"));
          System.out.println(a.isEmpty());
          System.out.println(a.size());
	}

}
