package stringExamples;

import java.util.Iterator;

public class HW2_CheckTheVowelsInAGivenString {

	public static void main(String[] args) {

        String s="Java is a programming Language";
        
        char[]c=s.toCharArray();
        int Vcount=0;
        int Ccount=0;
        
        for (int i = 0; i < c.length; i++) 
        {
			if (c[i]=='a' ||c[i]=='e' ||c[i]=='i' ||c[i]=='o' ||c[i]=='u')
			{
				Vcount++;	
			}
			else 
			{
				Ccount++;
			}
		
		}
		      
	}

}
