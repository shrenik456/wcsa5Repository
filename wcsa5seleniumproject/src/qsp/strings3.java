package qsp;
import java.util.Scanner;
public class strings3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String s= sc.nextLine();
		int upperCount=0;
		
		//logic 1
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>= 'A' && s.charAt(i)<='Z') {
				upperCount++;
			}
		}
		
           System.out.println(upperCount);
	}

}
