package oopsClass;

/*
class is collection of attributtes(variables) and behavior(methods).
 
Animal --> Dog, Elephant, Horse etc...
Student  --> Kim, David, Scott etc....
Employee ---> John, Smith, Mary etc...
 
class
---------
1) class is collection of variables and methods
2) class is logical entity/blue print
3) will not occupy space in the memory.
 
 
class Employee
{
variables
methods
}
 
object is an instance of a class.
 
object
-------------
1) object is an instance of a class/ object will be created by using class.
2) object is physical entity
3) occupy space in memory
4) we can create multiple objects for single class.
 
Employee emp=new Employee();
 
*/
 
public class ClassEg {
	String gova;
	int job;
	int money;
	String gorreganga;
	void display() {
		System.out.println(gova);
		System.out.println(job);
		System.out.println(money);
		System.out.println(gorreganga);
	}
	

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassEg gg=new ClassEg();
      gg.gova="76482";
      gg.gorreganga="Animal";
      gg.job=8765; 
      gg.display();
      
      ClassEg ga=new ClassEg();
      ga.gova="76482";
      ga.gorreganga="Animal";
      ga.job=8765; 
      ga.display();
	}*/

}
