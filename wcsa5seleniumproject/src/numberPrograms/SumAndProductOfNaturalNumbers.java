package numberPrograms;

import java.util.Iterator;

public class SumAndProductOfNaturalNumbers {

	public static void main(String[] args) {


		int number=5;
		int sum=0;
		int product=1;
		
		for (int i = 1; i <=number; i++) 
		{
			 sum=sum+i;
			 product=product*i;
        }
		System.out.println("sum of  1st "+number+"natural no is"+sum);
		System.out.print("product of 1st "+number+" natural  no is"+product);
	}
}
