package qsp;

public class HW3_TakingSumOfArray {

	public static void main(String[] args) {
            
		  int [] arr = {10,43,15,78,95}; 
	      int sum = 0; 
	      
	      //Loop through the array to calculate sum of elements  
	       for (int i = 0; i < arr.length; i++) 
	       {  
	       sum = sum + arr[i];  
	       } 
	       
	       System.out.println("Sum of all the elements of an array: " + sum); 
		
	}

}
