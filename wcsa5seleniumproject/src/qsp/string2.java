package qsp;

public class string2 {

	public static void main(String[] args) {
		
		String a="Java is a Programming language";
		
		int count=0;
		for(int i=0; i<a.length(); i++) 
		{
			if (a.charAt(i)!=' ')
		   {
			count++;
		   }
		}
		
		System.out.println("Total character present in given string are: "+count);
		

	}

	}

