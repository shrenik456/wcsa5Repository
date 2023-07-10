package numberPrograms;

public class BasePower {

	public static void main(String[] args) {

        int base=2;
        int power=3;
        int result=1; //8
        
        for (int i = 1; i <=power; i++) 
        {
			result= result*base;
		}
        System.out.println(result);

	}

}
