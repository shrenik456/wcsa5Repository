package arrayExamples;



public class HW_8Finding2ndLargestValue {

	public static void main(String[] args) {


		int[]a={10,20,45,43,35};
		int length=a.length;
		int temp;

		for (int i=0;i<length ;i++ )
		{
			for (int j=i+1;j<length;j++)
			{
				if (a[i]>a[j]) 
			    {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
			    }
				
			}
		}
		   System.out.println("2nd Largest no is:" +a[length-2]);

	}
	 
}
