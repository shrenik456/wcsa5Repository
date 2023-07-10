package arrayExamples;

import java.util.Arrays;

public class HW_5TakingTheReverseOfAnArray {

	public static void main(String[] args) {

        int []a= {1,2,3,4,5,6};
        int i=0;
        int j=a.length-1;
        
        while (i<j)
        {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
		}
        
        System.out.println(Arrays.toString(a));
     }

}
