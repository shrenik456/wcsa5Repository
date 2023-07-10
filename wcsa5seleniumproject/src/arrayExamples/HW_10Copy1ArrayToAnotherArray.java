package arrayExamples;

public class HW_10Copy1ArrayToAnotherArray {

	public static void main(String[] args) {

	      //Initialize array     
        int [] a1 = {1, 2, 3, 4, 5};    
        
         //Create another array arr2 with size of arr1    
        int [] a2= new int [a1.length]; 
        
        //Copying all elements of one array into another    
        for (int i = 0; i < a1.length; i++)
        {     
            a2[i] = a1[i];     
        }
        
      //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        
        for (int i = 0; i < a1.length; i++)
        {     
           System.out.print(a1[i] +" ");    
        }  
        
         System.err.println();
        System.out.println("Elements of New array: ");
         for (int i = 0; i < a2.length; i++)
        {
			System.out.print(a2[i] +" ");
		}
	}

}
