package arrayExamples;

public class HW_9Finding2ndMinValuefromArray {

	public static void main(String[] args) {

        int []a={7,4,6,8,15,78,45,1}; 
        int length=a.length;
        int temp;
        
        for (int i = 0; i < a.length; i++)
        {
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		 System.out.println("2nd min value from an given array is:"+a[length-2]);
		 
	}

}
