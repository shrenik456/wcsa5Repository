package stringExamples;

public class HW3_RemoveTheSpacesFromAnString {

	public static void main(String[] args) {

           String string="  Shrenik  ";
           System.out.println(string);
           System.out.println(string.length());
           
           System.err.println();
           
           String string2=string.trim();
           System.out.println(string2);
           System.out.println(string2.length());
           

	}

}
