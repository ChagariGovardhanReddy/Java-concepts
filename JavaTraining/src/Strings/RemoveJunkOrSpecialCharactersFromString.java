package Strings;

public class RemoveJunkOrSpecialCharactersFromString {

	public static void main(String[] args) {
		String s="govar2@#56dhan";
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);

		String s1="bks2324@$kkh";
		s1=s1.replaceAll("[^0-9]", "");
			System.out.println(s1);
	}

}
