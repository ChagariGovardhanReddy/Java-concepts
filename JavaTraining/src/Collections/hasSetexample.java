package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hasSetexample {

	public static void main(String[] args) {
	//HasSet,treeset,LinkedHasSet implements set interface
	//	Does not accept the duplicate values
// there no guarentee elements has adedd sequential order
HashSet<String> ha=new HashSet<String>();	
ha.add("gova");
ha.add("usa");
ha.add("uk");
ha.add("old");
ha.add("nam");
ha.add("India");
System.out.println(ha);
System.out.println(ha.remove("uk"));
System.out.println(ha.isEmpty());
System.out.println(ha.size());
//Iterator will navigate to each and every object and the return type for this is String
Iterator<String> i=ha.iterator();
//while loop will check wheather next index is displayed or not
while(i.hasNext())
{	
System.out.println(i.next());

}
	}
}
		
	


