package arrayExamples;

public class HW2_takingAvgOfArray {

	public static void main(String[] args) {

		int [] array= {1,2,3,4,5};
		int sum=0;
        int length=array.length;
		for(int i=0;i<array.length;i++)
		{
		sum= sum+array[i];
		}
		
		 double average = sum / length;
         
        System.out.println("Average of array : "+average);

	}

}
