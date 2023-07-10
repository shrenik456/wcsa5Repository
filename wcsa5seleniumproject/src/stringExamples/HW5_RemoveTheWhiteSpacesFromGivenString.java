package stringExamples;

public class HW5_RemoveTheWhiteSpacesFromGivenString {

	public static void main(String[] args) {

		 String b="o b je c t O ri en t e   d";
		 
		 String s1 = b.replaceAll("\\s", "");
		 System.out.println(s1);

		
	}

}
