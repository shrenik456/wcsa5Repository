package arrayExamples;

public class HW4_TakingProductOfArray {

	public static void main(String[] args) {

            int []a= {1,2,3,4,5};
            int product=1;
            
            for (int i = 0; i < a.length; i++) 
            {
				product=product*a[i];
			}
            
            System.err.println("product of an given array is:"+product);

	}

}
