package stringExamples;

public class HW4_CountTheNoOfVowelsConsonantAndCharacters {

	public static void main(String[] args) {
		
		String s="Elephant is a big animal";
	    int count=0;
	    int count1=0;
	    
	    for (int i = 0; i <s.length(); i++) 
	    {
			if (s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I'|| s.charAt(i)=='O'|| s.charAt(i)=='U') 
			{
				count++;
			}
			
			else if (s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				count++;
			}
		}
            System.out.println("Total Count of Vowel is "+count);
            
            for (int i = 0; i < s.length(); i++) 
            {
            	if (s.charAt(i)!='A'|| s.charAt(i)!='E'|| s.charAt(i)!='I'|| s.charAt(i)!='O'|| s.charAt(i)!='U') 
    			{
    				count1++;
    			}
    			
    			else if (s.charAt(i)!='a'|| s.charAt(i)!='e'|| s.charAt(i)!='i'|| s.charAt(i)!='o'|| s.charAt(i)!='u')
    			{
    				count1++;
    			}
            	
			}
            
            System.out.println("Total Count of consonant is "+count1);
	}

}
