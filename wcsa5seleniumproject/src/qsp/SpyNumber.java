package qsp;

public class SpyNumber {

	public static void main(String[] args) {
            
		int num=123;
		int sum=0;
		int lastdigit;
		int product=1;
		
		while (num>0)
		{
			lastdigit= num%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
		    num=num/10;
			
		}
			
	    if (sum==product)
	    {
			 System.out.println("The no is spy");
		}
	    else {
	    	System.out.println("The no is Not a spy");
		} 
	    

		
	}

}
