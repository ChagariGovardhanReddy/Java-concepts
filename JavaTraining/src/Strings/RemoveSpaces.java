package Strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		String s= "ammu Ganga a";
		String s2=s.replace(" ", "");
        System.out.println(s2);
        //[\\s]means whitespaces
        //s.replaceAll("[\\s]","");
	}

}
