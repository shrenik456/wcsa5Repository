package qsp;

import java.util.Scanner;
 // count the no of vowel present in given string    
public abstract class strings5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String s=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='A' || s.charAt(i)=='E'|| s.charAt(i)=='I'||s.charAt(i)=='O'|| s.charAt(i)=='U') {
			count++;
		}
		
		else if (s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u') {
		count++;
		}
		}
           
		System.out.println(count);
		
	}
}

		
		

	


