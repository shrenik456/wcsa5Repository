package arrayExamples;

public class HW_15FindPairWithGivenArray {

	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6};
		int target=7;
		
		int i=0;
		int j=a.length-1; //4
		
		while (i<j)
		{
			if (a[i]+a[j]>target)
			{
				j--;
			}
			else if (a[i]+a[j]< target)
			{
				i++;
			}
			else if (a[i]+a[j]== target) 
			{
				System.out.println("pair(" +a[i]+","+a[j]+")");
				i++;
				j--;
		    }
		}
	}

}
