package qsp;

public class HW1_findingEvenAndOddArray {

	public static void main(String[] args) {


		int a[]= {45,12,79,25,13,799,10380};
		System.out.println( "The odd no in given array is:");
		
		for (int index=0; index <a.length; index++)
		{
			if (a[index]%2!=0) 
			{
				System.out.println( a[index]);
			}		
		}
		 
		System.out.println( "The Even no in given array is:");
		for (int index = 0; index < a.length; index++) 
		{
			if (a[index]%2==0) 
			{
				System.out.println( a[index]);
			}
		}

	}

}
