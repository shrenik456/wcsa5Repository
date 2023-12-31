package arrayExamples;
import java.io.*;
public class HW_12FindingDistinctArray {

	public static void main(String[] args) {


		//create an integer array having some duplicate elements   
        int a[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
          
        //calculate length of the arrayWithDuplicates array   
        int length = a.length;   
          
        //create an integer array to store distinct elements   
        int[] distinctArray = new int[20];  
          
        //integer variable to increment array index  
        int index = 0;  
          
        // outermost loop to take element one by one from the leftmost side  
        for (int i = 0; i < length; i++)   
        {   
            int flag = 0;  
            //innermost loop to make comparision between elemnts and skip duplicate elements  
            for (int j = 0; j < i; j++)
            {  
                if (a[i] == a[j]){   
                    flag = 1;  
                    break;   
                }  
            }  
            //store or print the element if it is not present in the distinctArray  
            if (flag == 0){   
                distinctArray[index] = a[i];  
                index++;    //increment index value  
            }  
        }  
        //print distinctArray   
        for(int i = 0; i < index; i++)  
            System.out.print( distinctArray[i] + " "); 
	}

}
