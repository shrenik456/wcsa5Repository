package qsp;

public class Demo 
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=n*2-1;j>=i;j--) {
				System.out.print(" ");
				}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		for (int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
				
			}
			
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for (int j=n-1;j>=i;j--) {
				System.out.print("  ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
			
			
		
	}

  }


