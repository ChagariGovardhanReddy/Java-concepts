package oopsClass;

public class MainClassForAssignValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AssigningValueToVariables va=new AssigningValueToVariables(23 ,"pavs",'f');
		//Assign data using object reference
		va.grade='a';
        va.sid=876;
        va.sname="gova";
        va.printStuData();
      //assign data by using userdefined method
        va.setStuData(56, "dunaganga", 'd');
        
		//AssigningValueToVariables gs=new AssigningValueToVariables(23 ,"pavs",'f');
	}

}
