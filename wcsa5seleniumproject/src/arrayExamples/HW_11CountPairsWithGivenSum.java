package arrayExamples;

public class HW_11CountPairsWithGivenSum {

	public static void main(String[] args) {

         int[]a= {1,5,7,-1,5};
         int sum=6;
         int count=0;
         
         for (int i = 0; i < a.length; i++) 
        {
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]+a[j]==sum) 
				count++;
				
			}
		}
         System.out.println(count);
	}

}
