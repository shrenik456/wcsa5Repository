package stringExamples;

public class HW6_PrintEachCharInUpperCaseWithoutUsingInbuiltFn {

	public static void main(String[] args) {

        String s = "java is best";
        System.out.println("Lower case string is : " + s);
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) 
        {
            if (c[i] >= 'a' && c[i] <= 'z') 
            {
               c[i] = (char) ((int) c[i] - 32);
            }
        }
        
        System.out.print("Upper case string is : ");
        // print the string array
        for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);
        }

	}

}
