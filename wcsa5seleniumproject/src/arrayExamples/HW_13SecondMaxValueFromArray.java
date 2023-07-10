package arrayExamples;

public class HW_13SecondMaxValueFromArray {

	public static void main(String[] args) {


		
	      int a[] = {10, 20, 25, 63, 96, 57};
	      int length = a.length;
	      int temp;
	      
	      for(int i = 0; i<length; i++ ){
	         for(int j = i+1; j<length; j++){

	            if(a[i]>a[j])
	            {
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      
	      System.out.println("Third second largest number is:: "+a[length-2]);
	}

}
