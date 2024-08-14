package oopsClass;

public class AssigningValueToVariables {
	
		int sid;
		String sname;
		char grade;
		//Assign data using object reference
		void printStuData() {
			System.out.println(sid+" "+sname+" "+grade);
		}
		//assign data by using userdefined method
		void setStuData(int id,String name, char g) {
			sid=id;
			sname=name;
			grade=g;
			System.out.println(sid+" "+sname+" "+grade);
		}
		//By using Constructor
		AssigningValueToVariables(int id,String name, char g) {
			sid=id;
			sname=name;
			grade=g;
			System.out.println(sid+" "+sname+" "+grade);
		}

	}


