package arrayExamples;

import java.util.Iterator;

public class HW_7FindingTheMinElementFromArray {

	public static void main(String[] args) {

          int []a= {10,8,5,78,4,7};
          int min=a[0];
          
          for (int i = 0; i < a.length; i++) 
        {
        	  if (a[i]<min)
        		  min=a[i];	
		}
          System.out.println("The min element from an array is:" +min);
          
	}

}
