package qsp;

import java.util.Scanner;

public class countlowercase {
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int count=0;
		String x;
		char y;
		//take input from user
		System.out.println("Enter a String");
		x=sc.nextLine();
		//create loop to go out each letter
		for (int i=0;i<x.length() ;i++ )
		{
			//store character at index i in variable y
			y=x.charAt(i);
            // check if character is lowercase
			if (Character.isLowerCase(y))
			{
				// if letter is lower case then increase the count
				count++;
			}

		}
		// print the no. of lower case letter
         System.out.println("The no. of lowercase is = "+count);
	}

}
