package qsp;

public class AdditionOfsingleNo {

	public static void main(String[] args) {

                int num=12;
                int sum=0;
                int temperary;
                
                while (num>0)
                {
					temperary=num%10;
					sum=sum+temperary;
					num=num/10;
				}
                
                System.out.println("SumOfdigit is" +sum);
   }

}
