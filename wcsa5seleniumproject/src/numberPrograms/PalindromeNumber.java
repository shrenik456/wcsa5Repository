package numberPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {


		     
		  int n=452;//It is the number variable to be checked for palindrome  
		  int r,sum=0,temp;
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");

	}

}
