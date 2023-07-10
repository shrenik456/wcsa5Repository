package qsp;

public class vountnovowels {

	public static void main(String[] args) {
		int count=0;
		String str="Hi how are you";
		str=str.toLowerCase();
		
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				
				count++;
			}
		}
		       System.out.println("No. of vowels :" +count);
		       

	}

}
